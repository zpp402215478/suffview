package com.fastfood.school.service.controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fastfood.school.service.model.WeichatModel;
import com.fastfood.school.service.utils.MyX509TrustManager;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/userAction")
public class UserLoginAction {

	@RequestMapping(value="getWeichatUser",method = RequestMethod.GET)
	public String getWeichatUser(HttpServletRequest request, String appid, String secret, String grant_type, String js_code){
		String outputStr = null;
		StringBuffer buffer=null;  
	    try{  
	    //创建SSLContext  
	    SSLContext sslContext=SSLContext.getInstance("SSL");  
	    TrustManager[] tm={new MyX509TrustManager()};  
	    //初始化  
	    sslContext.init(null, tm, new java.security.SecureRandom());;  
	    //获取SSLSocketFactory对象  
	    SSLSocketFactory ssf=sslContext.getSocketFactory();  
	    String getUserUrl = "https://api.weixin.qq.com/sns/jscode2session?appid="+appid+"&secret="+secret+"&js_code="+js_code+"&grant_type="+grant_type;
	    URL url=new URL(getUserUrl);  
	    HttpsURLConnection conn=(HttpsURLConnection)url.openConnection();  
	    conn.setDoOutput(true);  
	    conn.setDoInput(true);  
	    conn.setUseCaches(false);  
	    conn.setRequestMethod("GET");  
	    conn.setRequestProperty("Content-Type", "application/json");
	    //设置当前实例使用的SSLSoctetFactory  
	    conn.setSSLSocketFactory(ssf);  
	    conn.connect();  
	    //往服务器端写内容  
	    if(null!=outputStr){  
	        OutputStream os=conn.getOutputStream();  
	        os.write(outputStr.getBytes("utf-8"));  
	        os.close();  
	    }  
	      
	    //读取服务器端返回的内容  
	    InputStream is=conn.getInputStream();  
	    InputStreamReader isr=new InputStreamReader(is,"utf-8");  
	    BufferedReader br=new BufferedReader(isr);  
	    buffer=new StringBuffer();  
	    String line=null;  
	    while((line=br.readLine())!=null){  
	        buffer.append(line);  
	    }  	
	    }catch(Exception e){  
	        e.printStackTrace();  
	    }  
	   
	    //{"session_key":"Eoyr8j9EyIxc2yeVB8cBSQ==","expires_in":7200,"openid":"o1Ekg0WWI17rC6oqvwTZqVpY8vTk"}
	    //查询用户是否存在   不存在   存入到数据库中
	   
	    JSONObject fromObject = JSONObject.fromObject(buffer);
	    WeichatModel weichat = (WeichatModel)JSONObject.toBean(fromObject);
	    HttpSession session = request.getSession();
	    session.setAttribute("weichat", weichat);
	    return buffer.toString();  
		
	}
	
}

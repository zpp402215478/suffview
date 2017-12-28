package com.fastfood.school.service.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fastfood.school.service.model.OrderModel;
import com.fastfood.school.service.model.WeichatModel;
import com.fastfood.school.service.serviceImp.OrderServiceImp;

@RestController
@RequestMapping("/orderAction")
public class OrderAction {

	@Autowired
	private OrderServiceImp orderService;
	
	/**
	 * 下订单   参数  订单基本参数    
	 * checkFood  key vaule形式    key 所点的菜品id   value  菜品数量
	 */
	@RequestMapping(value="addOrder",method = RequestMethod.POST)
	public void addOrder(HttpServletRequest request, OrderModel orderModel, String checkFood){
		WeichatModel weichatModel = (WeichatModel)request.getSession().getAttribute("weichat");
		orderModel.setCreator(weichatModel.getOpenid());
		Date date = new Date();
		orderModel.setCreatordate(date);
		//生成订单号
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
		String str = simpleDateFormat.format(date);
		Random random = new Random();
		int rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;// 获取5位随机数
		orderModel.setOrderno(str+rannum);
		orderService.addOrder(orderModel, checkFood);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

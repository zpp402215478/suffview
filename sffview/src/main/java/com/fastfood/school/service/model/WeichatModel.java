package com.fastfood.school.service.model;

public class WeichatModel {
	
	private String session_key;
	
	private String expires_in;
	
	private String openid;

	public String getSession_key() {
		return session_key;
	}

	public String getExpires_in() {
		return expires_in;
	}

	public String getOpenid() {
		return openid;
	}

	public void setSession_key(String session_key) {
		this.session_key = session_key;
	}

	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}
	
	
}

package com.fastfood.school.service.serviceImp;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fastfood.school.service.dao.OrderDao;
import com.fastfood.school.service.model.OrderModel;
import com.google.gson.Gson;

@Service
public class OrderServiceImp {

	@Resource
	private OrderDao orderDao;
	
	/**
	 * 下订单   参数  订单基本参数    
	 * checkFood  key vaule形式    key 所点的菜品id   value  菜品数量
	 */
	public void addOrder(OrderModel orderModel, String checkFood) {
		
		
		
		orderDao.addOrder(orderModel);
		
//		Gson gson = new Gson();
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map = gson.fromJson(checkFood, map.getClass());
		
	}

}

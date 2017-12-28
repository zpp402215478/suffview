package com.fastfood.school.service.dao;

import org.apache.ibatis.annotations.Mapper;

import com.fastfood.school.service.model.OrderModel;

@Mapper
public interface OrderDao {

	void addOrder(OrderModel orderModel);

}

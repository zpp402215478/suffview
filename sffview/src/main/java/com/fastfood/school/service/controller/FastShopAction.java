package com.fastfood.school.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fastfood.school.service.model.FastShopModel;
import com.fastfood.school.service.model.MenuModel;
import com.fastfood.school.service.serviceImp.FastShopServiceImp;
import com.fastfood.school.service.serviceImp.MenuServiceImp;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/fastShopAction")
public class FastShopAction {
	
	@Autowired
	private FastShopServiceImp fastShopServiceImp;
	
	@Autowired
	private MenuServiceImp menuServiceImp;
	
	@RequestMapping(value="getFastShop",method = RequestMethod.GET)
	public PageInfo<FastShopModel> getFastShop(int pagenum, int pagesize){
	 return fastShopServiceImp.getFastShop(pagenum, pagesize);
	}
	
	@RequestMapping(value="getFashShopById/{id}", method = RequestMethod.GET)
	public FastShopModel getFashShopById(@PathVariable int id){
		return fastShopServiceImp.getFashShopById(id);
		
	}
	
	@RequestMapping(value="getMenuByFoodType/{id}", method = RequestMethod.GET)
	public List<MenuModel> getMenuByFoodType(@PathVariable int id){
		return menuServiceImp.getMenuByFoodType(id);
	}
	
	@RequestMapping(value="addOrder",method = RequestMethod.POST,consumes = "application/json")
	public void addOrder(String username, String address, String telephone, String remark, Integer[] chcekFood){
		
		System.out.println(username);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

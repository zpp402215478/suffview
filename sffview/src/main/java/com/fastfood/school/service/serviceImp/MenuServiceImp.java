package com.fastfood.school.service.serviceImp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fastfood.school.service.dao.MenuDao;
import com.fastfood.school.service.model.MenuModel;

@Service
public class MenuServiceImp {
	@Resource
	private MenuDao menuDao;

	public List<MenuModel> getMenuByFoodType(int id) {
		return menuDao.getMenuList(id);
	}
	
	
}

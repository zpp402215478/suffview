package com.fastfood.school.service.serviceImp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fastfood.school.service.dao.FastShopDao;
import com.fastfood.school.service.dao.FoodTypeDao;
import com.fastfood.school.service.dao.MenuDao;
import com.fastfood.school.service.model.FastShopModel;
import com.fastfood.school.service.model.FoodTypeModel;
import com.fastfood.school.service.model.MenuModel;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class FastShopServiceImp {

	@Resource
	private FastShopDao fastShopDao;
	@Resource
	private FoodTypeDao foodTypeDao;
	@Resource
	private MenuDao menuDao;
	
	
	public PageInfo<FastShopModel> getFastShop(int pagenum, int pagesize) {
		PageHelper.startPage(pagenum, pagesize);
		 List<FastShopModel> fastShop = fastShopDao.getFastShop();
		
		return new PageInfo<FastShopModel>(fastShop);
	}

	public FastShopModel getFashShopById(int id) {
		//获得餐厅信息
		FastShopModel fastShopModel = fastShopDao.getFashShopById(id);
		//获得餐厅分类信息
		if(fastShopModel != null){
			List<FoodTypeModel> foodTypeList = foodTypeDao.getFoodTypeList(fastShopModel.getId());
			if(foodTypeList !=null && foodTypeList.size()>0){
				//通过分类第一个菜单
				for (FoodTypeModel foodTypeModel : foodTypeList) {
					List<MenuModel> menuList = menuDao.getMenuList(foodTypeModel.getId());
					foodTypeModel.setMenulist(menuList);
				}
				fastShopModel.setFoodtypeList(foodTypeList);
			}
		}
		return fastShopModel;
	}

}

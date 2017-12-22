package com.fastfood.school.service.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.fastfood.school.service.model.FastShopModel;

@Mapper
public interface FastShopDao {

	@Select("SELECT * FROM ssf_fastshop_tab")
	List<FastShopModel> getFastShop();

	@Select("SELECT * FROM ssf_fastshop_tab where id = #{id}")
	FastShopModel getFashShopById(int id);

}

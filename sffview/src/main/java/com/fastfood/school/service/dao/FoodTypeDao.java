package com.fastfood.school.service.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.fastfood.school.service.model.FoodTypeModel;

@Mapper
public interface FoodTypeDao {

	@Select("SELECT * FROM ssf_foodtype_tab where shopid = #{shopid}")
	List<FoodTypeModel> getFoodTypeList(int shopid);

}

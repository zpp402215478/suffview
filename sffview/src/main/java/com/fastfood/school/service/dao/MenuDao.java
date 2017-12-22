package com.fastfood.school.service.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.fastfood.school.service.model.MenuModel;

@Mapper
public interface MenuDao {

	@Select("SELECT * FROM ssf_menu_tab where foottypeid = #{foottypeid}")
	List<MenuModel> getMenuList(int foottypeid);

}

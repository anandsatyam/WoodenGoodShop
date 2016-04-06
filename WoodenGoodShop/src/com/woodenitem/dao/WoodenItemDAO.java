package com.woodenitem.dao;

import java.util.List;

import com.woodenitem.bean.WoodenItemBean;



public interface WoodenItemDAO {

	WoodenItemBean getByItem_Id(Long woodItem_id );

	List<WoodenItemBean> getAllWoodenItemsList();

	Long save(WoodenItemBean woodenItemBean);

	void update(WoodenItemBean woodenItemBean);

	void view(WoodenItemBean woodenItemBean);

	void delete(Long woodItem_id);

}

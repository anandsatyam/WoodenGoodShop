package com.raistudies.dao;

import org.apache.log4j.Logger;

import com.raistudies.controllers.UserListController;
import com.woodenitem.bean.WoodenItemBean;

public interface LikeCountDAO {
	
	static final Logger logger = Logger.getLogger(LikeCountDAO.class);  
	
	WoodenItemBean getcount(Long woodItem_id );

	void update(WoodenItemBean woodenItemBean);


}

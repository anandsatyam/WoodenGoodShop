package com.raistudies.dao;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.woodenitem.bean.WoodenItemBean;

@Repository
@Transactional
public class LikeCountDAOImpl implements LikeCountDAO {
	
	static final Logger logger = Logger.getLogger(LikeCountDAOImpl.class);  

	@Autowired
	private SessionFactory sessionFactoryCount;

	@Override
	public WoodenItemBean getcount(Long woodItem_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(WoodenItemBean woodenItemBean) {
		// TODO Auto-generated method stub
		
	}

}

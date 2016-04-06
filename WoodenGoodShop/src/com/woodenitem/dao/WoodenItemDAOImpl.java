package com.woodenitem.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.woodenitem.bean.WoodenItemBean;

@Repository
@Transactional
public class WoodenItemDAOImpl implements WoodenItemDAO {

	@Autowired
	private SessionFactory sessionFactoryWooden;

	@Override
	public WoodenItemBean getByItem_Id(Long woodItem_id) {

		return (WoodenItemBean) sessionFactoryWooden.getCurrentSession().get(WoodenItemBean.class, woodItem_id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<WoodenItemBean> getAllWoodenItemsList() {
		Criteria criteria = sessionFactoryWooden.getCurrentSession().createCriteria(WoodenItemBean.class);
		return criteria.list();
	}

	@Override
	public Long save(WoodenItemBean woodenItemBean) {

		return (Long) sessionFactoryWooden.getCurrentSession().save(woodenItemBean);
	}

	@Override
	public void update(WoodenItemBean woodenItemBean) {
		sessionFactoryWooden.getCurrentSession().merge(woodenItemBean);		
	}

	@Override
	public void view(WoodenItemBean woodenItemBean) {
		sessionFactoryWooden.getCurrentSession().merge(woodenItemBean);

	}

	@Override
	public void delete(Long woodItem_id) {
		WoodenItemBean woodenItemBean = getByItem_Id(woodItem_id);
		if (woodenItemBean != null)
			sessionFactoryWooden.getCurrentSession().delete(woodenItemBean); 		
	}

}

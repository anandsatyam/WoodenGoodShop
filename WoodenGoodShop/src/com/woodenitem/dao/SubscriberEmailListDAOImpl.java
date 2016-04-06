package com.woodenitem.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.woodenitem.bean.SubscribeEmailIdBean;

@Repository
@Transactional
public class SubscriberEmailListDAOImpl implements SubscriberEmailListDAO {

	@Autowired
	private SessionFactory sessionFactorySubscription;

	@Override
	public SubscribeEmailIdBean getByEmail_Id(Long email_id) {
		return (SubscribeEmailIdBean) sessionFactorySubscription.getCurrentSession().get(SubscribeEmailIdBean.class, email_id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SubscribeEmailIdBean> getAllEmailIdList() {
		Criteria criteria = sessionFactorySubscription.getCurrentSession().createCriteria(SubscribeEmailIdBean.class);
		return criteria.list();
	}

	@Override
	public void subscribe(SubscribeEmailIdBean subscribeEmailIdBean) {
		sessionFactorySubscription.getCurrentSession().merge(subscribeEmailIdBean);
	}

	@Override
	public void unsubscribe(SubscribeEmailIdBean subscribeEmailIdBean)  {

		String user_emailId = subscribeEmailIdBean.getUser_emailId();
		org.hibernate.classic.Session session = sessionFactorySubscription.openSession();
		org.hibernate.Transaction tx = session.beginTransaction();

		// logic to return message if id doesnt exists

		String hqlUpdate = "update SubscribeEmailIdBean s set s.subscriber=? where s.user_emailId= :user_emailId";
		org.hibernate.Query query = session.createQuery(hqlUpdate);
		query.setParameter(0, true);
		query.setParameter("user_emailId", user_emailId);

		int rowsAffected = query.executeUpdate();
		if (!tx.wasCommitted())
			tx.commit();
		session.close();

	}

}
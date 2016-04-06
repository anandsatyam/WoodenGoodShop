package com.woodenitem.dao;

import java.util.List;

import com.woodenitem.bean.SubscribeEmailIdBean;


public interface SubscriberEmailListDAO {

	SubscribeEmailIdBean getByEmail_Id(Long email_id );

	List<SubscribeEmailIdBean> getAllEmailIdList();

	void subscribe(SubscribeEmailIdBean subscribeEmailIdBean);

	void unsubscribe(SubscribeEmailIdBean subscribeEmailIdBean) ;	

}

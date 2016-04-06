package com.woodenitem.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SubscribeEmailIdBean")

public class SubscribeEmailIdBean {

	@Id	
	@Column(name="email_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long email_id;

	@Column(name="user_emailId")
	private String user_emailId;

	@Column(name="subscriber")
	private boolean subscriber;

	public SubscribeEmailIdBean(){

	}
	public SubscribeEmailIdBean(Long email_id,String user_emailId){
		this.email_id = email_id;
		this.user_emailId = user_emailId;
	}

	public Long getEmail_id() {
		return email_id;
	}
	public void setEmail_id(Long email_id) {
		this.email_id = email_id;
	}
	public String getUser_emailId() {
		return user_emailId;
	}
	public void setUser_emailId(String user_emailId) {
		this.user_emailId = user_emailId;
	}

	public boolean isSubscriber() {
		return subscriber;
	}
	public void setSubscriber(boolean subscriber) {
		this.subscriber = subscriber;
	}

}

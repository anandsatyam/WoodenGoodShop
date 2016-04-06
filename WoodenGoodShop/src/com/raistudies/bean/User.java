package com.raistudies.bean;

import org.apache.log4j.Logger;

import com.raistudies.controllers.UserListController;

public class User {
	static final Logger logger = Logger.getLogger(User.class);  
	private int Count = 0;
	
	
    public int getCount() {
		return Count;
	}
	public void setCount(int count) {
		Count = count;
	}
	
    

}

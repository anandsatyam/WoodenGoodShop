package com.woodenitem.dao;

import java.util.List;

import com.woodenitem.bean.CustomerCommentBlogBean;



public interface CustomerCommentBlogDAO {

	CustomerCommentBlogBean getByCustCommBlog_Id(Long woodItem_id );

	List<CustomerCommentBlogBean> getAllCustomerList();

	List<CustomerCommentBlogBean> getAllCustomerCommBlog();

	Long saveCustComment(CustomerCommentBlogBean customerCommentBlogBean);

	void editCustComment(CustomerCommentBlogBean customerCommentBlogBean);

	void viewCustComment(CustomerCommentBlogBean customerCommentBlogBean);

	void blockCustComment(Long woodItem_id);

}

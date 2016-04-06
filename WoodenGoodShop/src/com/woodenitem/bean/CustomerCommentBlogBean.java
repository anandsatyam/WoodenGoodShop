package com.woodenitem.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="CustomerCommentBlogBean")
public class CustomerCommentBlogBean {
	
	
	@Id
	@Column(name="CustCommentBlog_ID", unique=true, nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long CustCommentBlog_ID;
	
	@NotEmpty
	@Column(name="CustCommentBlogName")
	private String CustCommentBlogName;

	@Column(name="CustomerBlogWriteUp")
	private String CustomerBlogWriteUp;

	@Column(name="date")
	private Date date;

	@Column(name="VoteCount")
	private int VoteCount;

	public CustomerCommentBlogBean() {
		
    }
 
	public CustomerCommentBlogBean(Long CustCommentBlog_ID, String CustCommentBlogName, String CustomerBlogWriteUp ,
		Date date , int VoteCount) {		
		this.CustCommentBlog_ID = CustCommentBlog_ID;
		this.CustCommentBlogName = CustCommentBlogName;
		this.date = date;
		this.VoteCount = VoteCount;		
		
    }
	
	public Long getCustCommentBlog_ID() {
		return CustCommentBlog_ID;
	}

	public void setCustCommentBlog_ID(Long custCommentBlog_ID) {
		CustCommentBlog_ID = custCommentBlog_ID;
	}

	public String getCustCommentBlogName() {
		return CustCommentBlogName;
	}

	public void setCustCommentBlogName(String custCommentBlogName) {
		CustCommentBlogName = custCommentBlogName;
	}

	public String getCustomerBlogWriteUp() {
		return CustomerBlogWriteUp;
	}

	public void setCustomerBlogWriteUp(String customerBlogWriteUp) {
		CustomerBlogWriteUp = customerBlogWriteUp;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getVote() {
		return VoteCount;
	}

	public void setVote(int voteCount) {
		VoteCount = voteCount;
	}


}

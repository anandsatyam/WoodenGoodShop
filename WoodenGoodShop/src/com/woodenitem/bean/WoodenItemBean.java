package com.woodenitem.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="WoodenItem")

public class WoodenItemBean {
	@Id	
	@Column(name="woodItem_id")
	private Long woodItem_id;

	@Column(name="woodItem_name")
	@NotEmpty(message="*******************************")
	private String woodItem_name;

	@Column(name="woodItem_details")
	private String woodItem_details;

	@Column(name="woodItem_quantity")
	private String woodItem_quantity;    

	public WoodenItemBean(){

	}
	public WoodenItemBean(Long woodItem_id,String woodItem_name, String woodItem_details, String woodItem_quantity){
		this.woodItem_id = woodItem_id;
		this.woodItem_name = woodItem_name;
		this.woodItem_details = woodItem_details;
		this.woodItem_quantity = woodItem_quantity;		
	}

	public Long getWoodItem_id() {
		return woodItem_id;
	}
	public void setWoodItem_id(Long woodItem_id) {
		this.woodItem_id = woodItem_id;
	}
	public String getWoodItem_name() {
		return woodItem_name;
	}
	public void setWoodItem_name(String woodItem_name) {
		this.woodItem_name = woodItem_name;
	}
	public String getWoodItem_details() {
		return woodItem_details;
	}
	public void setWoodItem_details(String woodItem_details) {
		this.woodItem_details = woodItem_details;
	}
	public String getWoodItem_quantity() {
		return woodItem_quantity;
	}
	public void setWoodItem_quantity(String woodItem_quantity) {
		this.woodItem_quantity = woodItem_quantity;
	}
}
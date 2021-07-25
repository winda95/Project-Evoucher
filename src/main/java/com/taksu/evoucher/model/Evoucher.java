package com.taksu.evoucher.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evoucher implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false,updatable = false)
	private Long id;
	private String name;
	private String desc;
	private int expDt;
	private int price;
	private int qty;
	private String imageUrl;
	
	public Evoucher() {};
	
	public Evoucher(Long id, String name, String desc, int expDt, int price, int qty, String imageUrl) {
		this.id=id;
		this.name=name;
		this.desc=desc;
		this.expDt=expDt;
		this.price=price;
		this.qty=qty;
		this.imageUrl=imageUrl;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getExpDt() {
		return expDt;
	}

	public void setExpDt(int expDt) {
		this.expDt = expDt;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	@Override
	public String toString() {
		return "Voucher" +
				"id=" + id + '\''+
				", name=" + name + '\''+
				", desc=" + desc + '\''+
				", expdt=" + expDt + '\''+
				", price=" + price + '\''+
				", qty=" + qty + '\''+
				", imageUrl=" + imageUrl + '\''+
				'}';
				
	}
}

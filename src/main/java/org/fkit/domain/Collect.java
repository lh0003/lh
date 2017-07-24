package org.fkit.domain;

import java.util.Date;

public class Collect {
	private Integer book_id;				// id	
	private String name;			// 商品名
	private int price;			// 价格
	private int store;	
	private String image;			// 图片
	private int sellerid;	
	private int user_id;	
	
	public Collect() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStore() {
		return store;
	}
	public void setStore(int store) {
		this.store = store;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	public int getSellerid() {
		return sellerid;
	}
	public void setSellerid(int sellerid) {
		this.sellerid = sellerid;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "Order [book_id=" + book_id + ", name=" + name + ", price=" + price + ", store=" + store + ", image=" + image
				+ ",sellerid=" + sellerid + ",user_id=" + user_id + "]";
	}
	

}



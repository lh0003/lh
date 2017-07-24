package org.fkit.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * CREATE TABLE tb_book (
	id INT (11) PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR (54),
	productiondate DATE ,
	production VARCHAR (150),
	price DOUBLE ,
	image VARCHAR (54),
	remark VARCHAR (600)
);
 * */
public class Book implements Serializable{
	
	private Integer book_id;				// id	
	private String name;			// 商品名
	private String production;		// 生产厂家
	private Date productiondate;	// 生产日期
	private Integer price;			// 价格
	private String image;			// 图片
	private String remark;			// 详细描述
	private Integer sellerid;	
	private Integer store;	
	
	public Book() {
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

	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	public Date getProductiondate() {
		return productiondate;
	}
	public void setPublicationdate(Date productiondate) {
		this.productiondate = productiondate;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public Integer getSellerid() {
		return sellerid;
	}
	public void setSellerid(Integer sellerid) {
		this.sellerid = sellerid;
	}public Integer getStore() {
		return store;
	}
	public void setStore(Integer store) {
		this.store = store;
	}
	
	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", name=" + name + ", production=" + production + ", productiondate="
				+ productiondate + ", price=" + price + ", image=" + image
				+ ", remark=" + remark + ",sellerid=" + sellerid + ",store="+ store + "]";
	}
	

}

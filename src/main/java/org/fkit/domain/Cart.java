package org.fkit.domain;


public class Cart {
	private String name;
	private Integer count;
	private Integer book_id;
	private Integer user_id;
	private Integer price;
	private String sellerid;
	private String image;
	private Integer store;
	
	
	
	@Override
	public String toString() {
		return "Cart [ price=" + price + ", count=" + count + ", book_id=" + book_id + ", user_id="
				+ user_id + ", sellerid=" + sellerid + ", image=" + image + ", name=" + name + ", store=" + store + "]";
	}



	



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getCount() {
		return count;
	}



	public void setCount(Integer count) {
		this.count = count;
	}



	public Integer getBook_id() {
		return book_id;
	}



	public void setBookid(Integer book_id) {
		this.book_id = book_id;
	}



	public Integer getUser_id() {
		return user_id;
	}



	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}



	public Integer getPrice() {
		return price;
	}



	public void setPrice(Integer price) {
		this.price = price;
	}



	public String getSellerid() {
		return sellerid;
	}



	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}

	public Integer getStore() {
		return store;
	}



	public void setStore(Integer store) {
		this.store = store;
	}
}






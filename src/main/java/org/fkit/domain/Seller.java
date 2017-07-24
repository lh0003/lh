package org.fkit.domain;

import java.io.Serializable;

/**
 * CREATE TABLE tb_seller(
sellerid INT PRIMARY KEY AUTO_INCREMENT,      #id
sellerloginname VARCHAR(50) UNIQUE,		#登录名 邮箱
sellerPASSWORD VARCHAR(18),			#密码
sellername VARCHAR(18),			#店铺名
sellerphone VARCHAR(18),			#电话
selleraddress VARCHAR(255)			#地址
);
 * */
public class Seller implements Serializable{

	private Integer sellerid;			// id
	private String sellerloginname;	// 登录名
	private String sellerpassword;	// 密码
	private String sellername;	// 用户名
	private String sellerphone;		// 电话
	private String selleraddress;		// 地址
	
	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getSellerid() {
		return sellerid;
	}
	public void setSellerid(Integer sellerid) {
		this.sellerid = sellerid;
	}
	public String getSellerloginname() {
		return sellerloginname;
	}
	public void setSellerloginname(String sellerloginname) {
		this.sellerloginname = sellerloginname;
	}
	public String getSellerassword() {
		return sellerpassword;
	}
	public void setSellerpassword(String sellerpassword) {
		this.sellerpassword = sellerpassword;
	}
	public String getSellername() {
		return sellername;
	}
	public void setSellername(String sellername) {
		this.sellername = sellername;
	}
	public String getSellerphone() {
		return sellerphone;
	}
	public void setSellerhone(String sellerphone) {
		this.sellerphone = sellerphone;
	}
	public String getSelleraddress() {
		return selleraddress;
	}
	public void setSelleraddress(String selleraddress) {
		this.selleraddress = selleraddress;
	}
	@Override
	public String toString() {
		return "User [sellerid=" + sellerid + ", sellerloginname=" + sellerloginname + ", sellerpassword="
				+ sellerpassword + ", sellername=" + sellername + ", sellerphone=" + sellerphone
				+ ", selleraddress=" + selleraddress + "]";
	}
	
	
}

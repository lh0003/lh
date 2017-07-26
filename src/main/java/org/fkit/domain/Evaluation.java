package org.fkit.domain;

public class Evaluation {
	private Integer book_id;				// id	
	private Integer user_id;
	private String image;					// 图片
	private String evaluation;
	private String g1;
	private String g2;
	private String g3;
	
public Evaluation() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getBook_id() {
	return book_id;
}
public void setUser_id(Integer user_id) {
	this.user_id = user_id;
}
public Integer getUser_id() {
	return user_id;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getEvaluation() {
	return evaluation;
}
public void setEvaluation(String evaluation) {
	this.evaluation =evaluation;
}
public String getG1() {
	return g1;
}
public void setG1(String g1) {
	this.g1 =g1;
}
public String getG2() {
	return g2;
}
public void setG2(String g2) {
	this.g2 =g2;
}
public String getG3() {
	return g3;
}
public void setG3(String g3) {
	this.g3 =g3;
}
@Override
public String toString() {
	return "Book [book_id=" + book_id + ",user_id=" + user_id + ", image=" + image
			+ ", evaluation=" + evaluation + ",g1="+ g1 + ",g2="+ g2 + ",g3="+ g3 + "]";
}



}


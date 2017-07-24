package org.fkit.domain;

public class Evaluation {
	private Integer book_id;				// id	
	private Integer user_id;
	private String image;					// 图片
	private String evaluation;
	
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
@Override
public String toString() {
	return "Book [book_id=" + book_id + ",user_id=" + user_id + ", image=" + image
			+ ", evaluation=" + evaluation + "]";
}




}


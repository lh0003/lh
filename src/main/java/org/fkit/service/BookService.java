package org.fkit.service;

import java.util.List;
import org.fkit.domain.Book;
import org.fkit.domain.Evaluation;


/**
 * Book服务层接口
 * */
public interface BookService {
	
	/**
	 * 查找所有图书
	 * @return Book对象集合
	 * */
	List<Book> getAll();

	List<Book> getSome1();

	List<Book> getSome(String remark);
	

	void evaluate(Integer book_id, Integer user_id, String image, String evaluation, String g1, String g2, String g3);



}

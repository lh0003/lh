package org.fkit.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.fkit.domain.Book;
import org.fkit.domain.Cart;



public interface CartService {
	List<Cart> getAll();
	Cart selectBook(Integer book_id,Integer user_id);
	void updateBook(Integer book_id,Integer user_id,Integer count);
	void addBook(Integer book_id, Integer user_id, Integer count, Integer sellerid, String image, Integer price, String name,Integer store);
	void updatenumber(@Param("book_id")Integer book_id,@Param("user_id")Integer  user_id,@Param("booknumber")Integer  booknumber);
	void deleteBook(@Param("book_id")Integer book_id,@Param("user_id")Integer  user_id);
}

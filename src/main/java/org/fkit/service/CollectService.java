package org.fkit.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.fkit.domain.Collect;

public interface CollectService {
	List<Collect> getAll();
	Collect selectBook(Integer book_id,Integer user_id);
	void addBook(Integer book_id, Integer user_id, Integer sellerid, String image, Integer price, String name, Integer store);
	void deleteCollect(@Param("book_id")Integer book_id,@Param("user_id")Integer  user_id);
}

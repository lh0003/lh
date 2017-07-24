package org.fkit.service;

import java.util.List;

import org.fkit.domain.Order;


public interface OrderService {
	List<Order> getAll();
	Order selectCart(Integer user_id);
	void addOrder(Integer book_id, Integer user_id, Integer count, Integer sellerid, String image, Integer price, String name,String state,Integer store);
	void addOrder(Integer book_id, Integer count);
	void changeStore(Integer book_id, Integer count,Integer store);
	void ensureOrder(String state2,Integer book_id,Integer user_id);
}

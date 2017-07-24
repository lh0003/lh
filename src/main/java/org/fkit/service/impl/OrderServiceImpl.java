package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Order;
import org.fkit.mapper.OrderMapper;
import org.fkit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * User服务层接口实现类
 * @Service("userService")用于将当前类注释为一个Spring的bean，名为userService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("orderService")
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderMapper orderMapper;
	@Transactional(readOnly=true)
	public List<Order> getAll() {
		return orderMapper.findAll();
	}


	@Override
	public Order selectCart(Integer user_id) {
		// TODO Auto-generated method stub
		return orderMapper.findWithID(user_id);
	}
	@Override
	public void addOrder(Integer book_id, Integer user_id, Integer count, Integer sellerid, String image, Integer price, String name,String state,Integer store) {
		// TODO Auto-generated method stub
		orderMapper.addOrder(book_id, user_id, count, sellerid, image, price, name,state);
	}
	public void changeStore(Integer book_id,Integer count,Integer store){
		orderMapper.changestore(book_id, count,store);
	}


	@Override
	public void addOrder(Integer book_id, Integer count) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void ensureOrder(String state2,Integer book_id,Integer user_id) {
		// TODO Auto-generated method stub
//		Order order = orderMapper.findWithIdd(book_id,user_id);
		orderMapper.ensureOrder(state2,book_id,user_id);
		
	}

}

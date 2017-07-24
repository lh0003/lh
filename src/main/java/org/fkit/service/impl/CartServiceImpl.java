package org.fkit.service.impl;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.apache.ibatis.annotations.Param;
import org.fkit.domain.Book;
import org.fkit.domain.Cart;
import org.fkit.mapper.BookMapper;
import org.fkit.mapper.CartMapper;
import org.fkit.mapper.UserMapper;
import org.fkit.service.BookService;
import org.fkit.service.CartService;
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
@Service("cartService")
public class CartServiceImpl implements CartService{
	/**
	 * 自动注入UserMapper
	 * */
	@Autowired
	private CartMapper cartMapper;
    
	/**
	 * UserService接口login方法实现
	 * @see { UserService }
	 * */
	@Transactional(readOnly=true)
	public List<Cart> getAll() {
		return cartMapper.findAll();
	}


	@Override
	public Cart selectBook(Integer book_id, Integer user_id) {
		// TODO Auto-generated method stub
		return cartMapper.findWithID(book_id,user_id);
	}

	@Override
	public void updateBook(Integer book_id, Integer user_id, Integer count) {
		// TODO Auto-generated method stub
		cartMapper.updateCart(book_id, user_id, count);
	}


	
	@Override
	public void addBook(Integer book_id, Integer user_id, Integer count, Integer sellerid, String image, Integer price, String name,Integer store) {
		// TODO Auto-generated method stub
		cartMapper.addCart(book_id, user_id, count, sellerid, image, price, name,store);
	}
	

	@Override
	public void deleteBook(Integer book_id,Integer  user_id) {
		// TODO Auto-generated method stub
		

		cartMapper.deletebook( book_id, user_id);
	}


	@Override
	public void updatenumber(Integer book_id,Integer user_id,Integer booknumber) {
		// TODO Auto-generated method stub
		cartMapper.updatenumber(book_id, user_id, booknumber);
		
	}



}

package org.fkit.service.impl;

import java.util.List;


import org.fkit.domain.Collect;
import org.fkit.mapper.CollectMapper;
import org.fkit.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("collectService")
public class CollectServiceImpl implements CollectService{
	/**
	 * 自动注入UserMapper
	 * */
	@Autowired
	private CollectMapper collectMapper;
    
	/**
	 * UserService接口login方法实现
	 * @see { UserService }
	 * */
	@Transactional(readOnly=true)
	public List<Collect> getAll() {
		return collectMapper.findAll();
	}


	@Override
	public Collect selectBook(Integer book_id, Integer user_id) {
		// TODO Auto-generated method stub
		return collectMapper.findWithID(book_id,user_id);
	}

	
	@Override
	public void addBook(Integer book_id, Integer user_id, Integer sellerid, String image, Integer price, String name, Integer store) {
		// TODO Auto-generated method stub
		collectMapper.addCollect(book_id, user_id, sellerid, image, price, name,store);
	}

	@Override
	public void deleteCollect(Integer book_id,Integer  user_id) {
		// TODO Auto-generated method stub
		

		collectMapper.deletecollect( book_id, user_id);
	}
}

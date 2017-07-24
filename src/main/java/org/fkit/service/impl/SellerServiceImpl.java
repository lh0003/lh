package org.fkit.service.impl;

import org.fkit.domain.Seller;
import org.fkit.domain.User;
import org.fkit.mapper.SellerMapper;
import org.fkit.mapper.UserMapper;
import org.fkit.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("sellerService")
public class SellerServiceImpl implements SellerService {
	@Autowired
	private SellerMapper sellerMapper;

	@Override
	public Seller Sellerlogin(String sellerloginname, String sellerpassword) {
		// TODO Auto-generated method stub
		return sellerMapper.findWithSellerloginnameAndSellerpassword(sellerloginname, sellerpassword);
	}

	@Override
	public Seller sellersave(String sellerloginname, String sellerpassword, String sellername, String sellerphone,
			String selleraddress) {
	return sellerMapper.saveseller(sellerloginname, sellerpassword, sellername, sellerphone, selleraddress);
	}



	@Override
	public void updateSeller(Seller seller) {
		// TODO Auto-generated method stub
		sellerMapper.sellerupdate(seller);
	}

	/**
	 * UserService接口login方法实现
	 * @see { UserService }
	 * */

}

package org.fkit.service;

import org.fkit.domain.Seller;

public interface SellerService {
	Seller Sellerlogin(String sellerloginname,String sellerpassword);
	Seller sellersave(String sellerloginname,String sellerpassword,String sellername,String sellerphone,String selleraddress) ;
	void updateSeller(Seller seller);
}





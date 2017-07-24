package org.fkit.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.domain.Seller;
import org.fkit.domain.User;

public interface SellerMapper {
	@Select("select * from tb_seller where sellerloginname = #{sellerloginname} and sellerpassword = #{sellerpassword}") 
Seller	 findWithSellerloginnameAndSellerpassword(@Param("sellerloginname")String sellerloginname,
			@Param("sellerpassword") String sellerpassword) ;
	
	
	@Select("insert into tb_seller (sellerloginname,sellerpassword,sellername,sellerphone,selleraddress)values(#{sellerloginname},#{sellerpassword},#{sellername},#{sellerphone},#{selleraddress})")
	Seller saveseller(@Param("sellerloginname")String sellerloginname,@Param("sellerpassword") String sellerpassword,
			@Param("sellername") String sellername,@Param("sellerphone") String sellerphone,@Param("selleraddress") String selleraddress);
	
	@Update("update tb_seller set sellerpassword=#{sellerpassword} where sellerloginname=#{sellerloginname}")
	void sellerupdate(Seller seller) ;
	



}




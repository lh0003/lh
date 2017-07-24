package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.domain.Order;

public interface OrderMapper {
	@Insert("insert into tb_order(book_id,name,price,count,sellerid,image,user_id,state)values(#{book_id},#{name},#{price},#{count},#{sellerid},#{image},#{user_id},#{state})")
	void addOrder(@Param("book_id")Integer  book_id,@Param("user_id")Integer  user_id,@Param("count")Integer  count,@Param("sellerid")Integer  sellerid,@Param("image")String  image,@Param("price")Integer  price,@Param("name")String  name,@Param("state")String  state);
	
	@Update("update tb_book set store=(#{store}-#{count}) where book_id=#{book_id}")
	void changestore(@Param("book_id")Integer  book_id,@Param("count")Integer  count,@Param("store")Integer  store);
	
	@Select("select * from  tb_cart where user_id=#{user_id}")
	Order findWithID(@Param("user_id") Integer  user_id);
	
	@Select("select*from tb_order")
    List<Order> findAll();
	
	@Update("update tb_order set state=#{state2}  where book_id=#{book_id} and user_id=#{user_id}")
	void ensureOrder(@Param("state2") String  state2,@Param("book_id")Integer book_id,@Param("user_id") Integer  user_id);
	
//	@Select("select * from  tb_cart where user_id=#{user_id}and book_id=#{book_id}")
//	Order findWithIdd(Integer book_id,Integer user_id);



	
}

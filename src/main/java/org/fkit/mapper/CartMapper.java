package org.fkit.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.domain.Book;
import org.fkit.domain.Cart;

public interface CartMapper {
	@Insert("insert into tb_cart values(#{book_id},#{name},#{price},#{count},#{sellerid},#{image},#{user_id},#{store})")
	void addCart(@Param("book_id")Integer  book_id,@Param("user_id")Integer  user_id,@Param("count")Integer  count,@Param("sellerid")int  sellerid,@Param("image")String  image,@Param("price")int  price,@Param("name")String  name,@Param("store")int  store);
	
	@Select("select * from  tb_cart where book_id=#{book_id}")
	Cart findWithID(@Param("book_id") int  book_id,@Param("user_id") Integer  user_id);

	@Update("update tb_cart set count=count+1 where book_id=#{book_id} ")
	void updateCart(@Param("book_id")Integer book_id,@Param("user_id")Integer  user_id,@Param("count")Integer  count);

	@Select("select*from tb_cart")
    List<Cart> findAll();
	
	@Update("update tb_cart set count=#{booknumber} where book_id=#{book_id} and user_id=#{user_id} ")
	void updatenumber(@Param("book_id")Integer book_id,@Param("user_id")Integer  user_id,@Param("booknumber")Integer  booknumber);
	@Delete("delete from tb_cart where book_id=#{book_id} and user_id=#{user_id}")
	void deletebook(@Param("book_id")Integer book_id,@Param("user_id")Integer  user_id);


}


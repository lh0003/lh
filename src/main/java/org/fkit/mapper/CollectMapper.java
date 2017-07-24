package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Collect;

public interface CollectMapper {
	@Insert("insert into tb_collect values(#{book_id},#{name},#{price},#{image},#{sellerid},#{user_id},#{store})")
	void addCollect(@Param("book_id")Integer  book_id,@Param("user_id")Integer  user_id,@Param("sellerid")Integer  sellerid,@Param("image")String  image,@Param("price")Integer  price,@Param("name")String  name,@Param("store")Integer  store);
	
	@Select("select * from  tb_collect where book_id=#{book_id}")
	Collect findWithID(@Param("book_id") int  book_id,@Param("user_id") Integer  user_id);
	@Select("select*from tb_collect")
    List<Collect> findAll();
	
	@Delete("delete from tb_collect where book_id=#{book_id} and user_id=#{user_id}")
	void deletecollect(@Param("book_id")Integer book_id,@Param("user_id")Integer  user_id);
	
	
}

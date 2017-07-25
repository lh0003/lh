package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Book;
import org.fkit.domain.Evaluation;


/**
 * BookMapper接口
 * */
public interface BookMapper {

	/**
	 * 查询所有图书
	 * @return 图书对象集合
	 * */
	@Select(" select * from tb_book ")
	List<Book> findAll();
	@Select(" select * from tb_book ")
	List<Book> findsome1();
	@Select(" select * from tb_book where remark=#{remark}")
	List<Book> findsome(@Param("remark") String remark);
	
	@Insert("insert into tb_evaluation(book_id,user_id,image,evaluation) values(#{book_id},#{user_id},#{image},#{evaluation})")
	void insert(@Param("book_id")Integer book_id,@Param("user_id")Integer user_id,@Param("image")String image,@Param("evaluation")String evaluation);
	
}

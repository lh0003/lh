package org.fkit.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.domain.Seller;
import org.fkit.domain.User;

/**
 * UserMapper接口
 * */
public interface UserMapper {
	
	/**
	 * 根据登录名和密码查询用户
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	@Select("select * from tb_user where loginname = #{loginname} and password = #{password}")
	User findWithLoginnameAndPassword(@Param("loginname")String loginname,
			@Param("password") String password);
	
	@Select("insert into tb_user(loginname,password,username,phone,address)values(#{loginname},#{password},#{username},#{phone},#{address})")
	User saveuser(@Param("loginname")String loginname,@Param("password") String password,
			@Param("username") String username,@Param("phone") String phone,@Param("address") String address);
	
	@Update("update tb_user set password=#{password} where loginname=#{loginname}")
	int update(User user);

	int save(User user);
	
//	@Select("select * from tb_user where loginname = #{loginname} ")
//	User findWithLoginnameAndEmail(@Param("loginname")String loginname,
//			@Param("email") String email);
//	void updateUserPassword(String loginname,String password);

	

}


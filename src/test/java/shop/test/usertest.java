package shop.test;

import org.fkit.domain.User;
import org.fkit.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/WEB-INF/applicationContext.xml","classpath*:/WEB-INF/spring-config.xml"})
public class usertest {
	@Autowired
    private UserService userService;
@Test
public  void loginTest(){
	String loginname="刘惠";
	String password="123";
	User user=userService.login(loginname, password);
	System.out.println(user);
}
@Test
public  void saveTest(){
	String loginname="99999999";
	String password="1";
	String username="1";
	String phone="1";
	String address="1";
	User save=userService.save(loginname, password,username,phone,address);
	System.out.println(save);
}

}
package shop.test;

import org.fkit.domain.Order;
import org.fkit.service.OrderService;
import org.fkit.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/WEB-INF/applicationContext.xml","classpath*:/WEB-INF/spring-config.xml"})
public class orderTest {
	@Autowired
    private OrderService orderService;
@Test
public  void selectCartTest(){
	Integer user_id=1;
	Order order=orderService.selectCart(user_id);
	System.out.println(order);
	
	
}}

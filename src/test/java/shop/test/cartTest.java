package shop.test;

import org.fkit.domain.Cart;
import org.fkit.service.CartService;
import org.fkit.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/WEB-INF/applicationContext.xml","classpath*:/WEB-INF/spring-config.xml"})
public class cartTest {
	@Autowired
    private CartService cartService;
@Test
public  void selectBookTest(){
	Integer book_id=1;
	Integer user_id=2;
	Cart cart=cartService.selectBook(book_id, user_id);
	System.out.println(cart);
	
}
}

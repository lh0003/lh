package shop.test;

import java.util.List;

import org.fkit.domain.Book;
import org.fkit.domain.Cart;
import org.fkit.domain.Order;
import org.fkit.service.BookService;
import org.fkit.service.CartService;
import org.fkit.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/WEB-INF/applicationContext.xml","classpath*:/WEB-INF/spring-config.xml"})
public class ListTest {
	
	
	    
	    @Autowired
	    private BookService bookService;
	@Test
	public  void testBookController(){
		List<Book> book_list=bookService.getSome("酒水乳饮");
      System.out.println(book_list);
	}

	 @Autowired
	    private CartService cartService;
	@Test
	public  void testCartController(){
	    List<Cart> cart_list = cartService.getAll();
   System.out.println(cart_list);
	}

	 @Autowired
	    private OrderService orderService;
	@Test
	public  void testOrderController(){
		List<Order> order_list = orderService.getAll();
   System.out.println(order_list);
	}

}

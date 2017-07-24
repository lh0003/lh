package shop.test;

import java.util.List;

import org.fkit.domain.Book;
import org.fkit.service.BookService;
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
	    List<Book> book_list = bookService.getAll();
      System.out.println(book_list);
	}

	

}

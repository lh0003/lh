package shop.test;

import org.fkit.domain.Collect;
import org.fkit.service.CollectService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/WEB-INF/applicationContext.xml","classpath*:/WEB-INF/spring-config.xml"})
public class collectTest {
	@Autowired
    private CollectService collectService;
@Test
public  void selectBookTest(){
	Integer book_id=2;
	Integer user_id=1;
	Collect collect=collectService.selectBook(book_id, user_id);
	System.out.println(collect);
}

}

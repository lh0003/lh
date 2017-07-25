package shop.test;

import org.fkit.domain.Seller;
import org.fkit.service.SellerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/WEB-INF/applicationContext.xml","classpath*:/WEB-INF/spring-config.xml"})
public class sellertest {
	@Autowired
    private SellerService sellerService;
	@Test
	public  void sellerloginTest(){
		String sellerloginname="lh";
		String sellerpassword="12";
		Seller seller=sellerService.Sellerlogin(sellerloginname, sellerpassword);
		System.out.println(seller);
	}
	
}

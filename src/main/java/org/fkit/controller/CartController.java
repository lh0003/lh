package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fkit.domain.Book;
import org.fkit.domain.Cart;
import org.fkit.domain.User;
import org.fkit.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartController {
	@Autowired
	@Qualifier("cartService")
	private CartService cartService;

	@RequestMapping(value="/addcart")
	public String addcart(ModelAndView mv,
			 HttpSession session,HttpServletRequest request,Integer book_id,Integer sellerid,Integer price,String name,String image,Integer store){
		Integer user_id=(Integer)session.getAttribute("numb");
	Cart cart = cartService.selectBook(book_id, user_id);
		int a=1;
		if(cart!=null){
			Integer count=a+cart.getCount();
			cartService.updateBook(book_id, user_id, count);
		
		}else{
			int count=1;
			cartService.addBook(book_id, user_id, count, sellerid, image, price, name,store);
			System.out.println("______");
		
		}
	        // 获得所有图书集合
			List<Cart> cart_list = cartService.getAll();
			System.out.println(cart_list);
			// 将图书集合添加到model当中		
			session.setAttribute("cart_list", cart_list);
			// 跳转到cart页面

			return "cart";
	
}
	
	//删除物品
		@RequestMapping(value = "/delete")
		public String delete(Model model,HttpServletRequest request,Integer book_id,Integer user_id) {
			cartService.deleteBook(book_id,user_id);
			List<Cart> cart_list = cartService.getAll();
			// 将图书集合添加到model当中
			model.addAttribute("cart_list", cart_list);
			// 跳转到main页面
			return "cart";

		}
		//从购物车里改变数量
		@RequestMapping(value="/revamp")
 	public String revamp(Model model,HttpServletRequest request,Integer book_id,Integer user_id,Integer booknumber){
			
			cartService.updatenumber(book_id,user_id,booknumber);
			
			List<Cart> cart_list = cartService.getAll();
			// 将图书集合添加到model当中
		model.addAttribute("cart_list", cart_list);
			// 跳转到cart页面
			return "cart";
		}
	}

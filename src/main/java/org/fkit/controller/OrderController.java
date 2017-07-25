package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fkit.domain.Order;
import org.fkit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController {
	@Autowired
	@Qualifier("orderService")
	private OrderService orderService;

	@RequestMapping(value="/order")
	public String order(ModelAndView mv,
			 HttpSession session,
			 Model model,HttpServletRequest request,Integer book_id,Integer sellerid,Integer price, Integer store,String name,String image,Integer user_id,Integer count){
		String state="待发货";
		Order order=new Order();
		order.setState(state);
			orderService.addOrder(book_id, user_id, count, sellerid,image, price, name,state,store);
			orderService.changeStore(book_id,count,store);
	        // 获得所有图书集合
			List<Order> order_list = orderService.getAll();
			// 将图书集合添加到model当中		
			model.addAttribute("order_list", order_list);
			// 跳转到cart页面

			return "order";
	
}
	
	@RequestMapping(value="/ensure")
	public String ensure(Model model,
			 HttpSession session,HttpServletRequest request,Integer book_id,Integer user_id){
		String state2="已完成";
		orderService.ensureOrder(state2,book_id,user_id);
		model.addAttribute("book_id",book_id);
		System.out.print(book_id);
		return"evaluation";
	}
}

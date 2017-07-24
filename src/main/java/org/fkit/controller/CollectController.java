package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fkit.domain.Cart;
import org.fkit.domain.Collect;
import org.fkit.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class CollectController {
	@Autowired
	@Qualifier("collectService")
	private CollectService collectService;

	@RequestMapping(value="/collect")
	public String order(ModelAndView mv,
			 HttpSession session,HttpServletRequest request,Integer book_id,Integer sellerid,Integer price,String name,String image,Integer store){
		Integer user_id=(Integer)session.getAttribute("numb");
		Collect collect = collectService.selectBook(book_id, user_id);
		if(collect!=null){
			mv.addObject("message", "已收藏!");
			mv.setViewName("collect.jsp");
		}else{
			collectService.addBook(book_id, user_id, sellerid, image, price, name,store);
		}
	        // 获得所有图书集合
			List<Collect> collect_list = collectService.getAll();
			// 将图书集合添加到model当中		
			session.setAttribute("collect_list", collect_list);
			// 跳转到cart页面

			return "collect";
	
}
	
	//删除物品
			@RequestMapping(value = "/removecollect")
			public String delete(Model model,HttpServletRequest request,Integer book_id,Integer user_id) {
				collectService.deleteCollect(book_id,user_id);
				List<Collect> collect_list = collectService.getAll();
				// 将图书集合添加到model当中
				model.addAttribute("collect_list", collect_list);
				// 跳转到main页面
				return "collect";

			}
}

package org.fkit.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fkit.domain.Book;
import org.fkit.domain.Evaluation;
import org.fkit.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 处理图书请求控制器
 * */
@Controller
public class BookController {
	
	/**
	 * 自动注入BookService
	 * */
	@Autowired
	@Qualifier("bookService")
	private BookService bookService;

	/**
	 * 处理/main请求
	 * @throws Exception 
	 * */
	@RequestMapping(value="/main")
	public String mainn(){
		return "main";
	}
	
	@RequestMapping(value="/milkForm")
	 public String gift(Model model,HttpServletRequest request) throws Exception{	
		
		request.setCharacterEncoding("UTF-8");
		List<Book> book_list=bookService.getSome("酒水乳饮");
		model.addAttribute("book_list", book_list);
		return "milkForm";
	}

	 @RequestMapping(value="/evaluate")
	public String evaluate( ModelAndView mv ,HttpSession session,HttpServletRequest request,Integer book_id,Integer user_id,String image,String evaluation,String g1,String g2,String g3) {
		bookService.evaluate(book_id,user_id,image,evaluation,g1,g2,g3);
		mv.addObject("message", "评价成功!");
		return "main";
	}
}

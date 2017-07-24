package org.fkit.controller;

import javax.servlet.http.HttpSession;

import org.fkit.domain.Seller;
import org.fkit.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * 处理用户请求控制器
 * */
@Controller
public class SellerController {
	
	/**
	 * 自动注入UserService
	 * */
	@Autowired
	@Qualifier("sellerService")
	private SellerService sellerService;

	/**
	 * 处理/login请求
	 * */
	@RequestMapping(value="/sellerlogin")
	 public ModelAndView sellerlogin(
			 String sellerloginname,String sellerpassword,
			 ModelAndView mv,
			 HttpSession session){
		
		// 根据登录名和密码查找用户，判断用户登录
		Seller seller = sellerService.Sellerlogin(sellerloginname, sellerpassword);
		if(seller != null){
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("seller", seller);
			// 转发到main请求
			mv.setView(new RedirectView("./sellermain"));
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.addObject("message", "登录名或密码错误，请重新输入!");
			mv.setViewName("sellerloginForm");
		}
		return mv;
	}
	

	@RequestMapping(value="/sellersave")
	public ModelAndView sellersave(
		ModelAndView mv,
		HttpSession session,
		String sellerloginname,
		String sellerpassword,String sellername,String sellerphone,String selleraddress){
		System.out.println("111");
		Seller count = sellerService.sellersave(sellerloginname, sellerpassword, sellername, sellerphone, selleraddress);
		System.out.println("222");
		mv.addObject("message","注册成功！");
		mv.setViewName("sellerloginForm");
		return mv;
	}
	@RequestMapping(value="/sellerupdate")
	public ModelAndView sellerupdate(
			@ModelAttribute Seller seller,
		ModelAndView mv,
		HttpSession session){
		
	
		sellerService.updateSeller(seller);
		mv.addObject("message","修改成功！");
		mv.setViewName("sellerloginForm");
	
		return mv;
}
	}


package com.edu.b2bshop.shop.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/")
	public ModelAndView getMain(HttpServletRequest request) {
		logger.info("메인호출함");
		ModelAndView mav = new ModelAndView("shop/index");
		
		return mav;
	}
	
	/*
	 도경 로그인 
	 */
	@GetMapping("/loginform")
	public ModelAndView getLogin(HttpServletRequest request) {
		logger.info("로그인 페이지 호출함");
		ModelAndView mav = new ModelAndView("shop/member/loginform");
		
		return mav;
	}
}

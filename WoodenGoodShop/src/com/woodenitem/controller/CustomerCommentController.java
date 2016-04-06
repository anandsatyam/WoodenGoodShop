package com.woodenitem.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.raistudies.dao.LikeCountDAO;

@Controller
public class CustomerCommentController {

	static final Logger logger = Logger.getLogger(CustomerCommentController.class);  

	
	@RequestMapping("/showCommentPage")
	public ModelAndView getCommentPage()
	{
		ModelAndView mav = new ModelAndView("CommentSection");
		return mav;
	}
}

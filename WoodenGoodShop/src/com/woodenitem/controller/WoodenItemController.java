package com.woodenitem.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.raistudies.dao.LikeCountDAO;
import com.woodenitem.bean.WoodenItemBean;
import com.woodenitem.dao.WoodenItemDAO;

@Controller
public class WoodenItemController {
	
	static final Logger logger = Logger.getLogger(WoodenItemController.class);  

	@Autowired
	private WoodenItemDAO woodenItemDAO;


	/*	@Autowired
	private SubscriberEmailListDAO subscriberEmailListDAO;

	@RequestMapping("/showSubscribePage")
	public ModelAndView getSubscribePage()
	{
		ModelAndView mav = new ModelAndView("SubscribeForm");		
		return mav;
	}

	@RequestMapping(value="/saveforSubscription", method=RequestMethod.POST)
	public String update(@ModelAttribute("editWoodenItemsPage") SubscribeEmailIdBean subscribeEmailIdBean, BindingResult result, SessionStatus status)
	{

		subscriberEmailListDAO.subscribe(subscribeEmailIdBean);
		status.setComplete();		

		return "redirect:viewWoodenItemsPage.do";
	}	
	 */

	@RequestMapping("/viewWoodenItemsPage")
	public ModelAndView getAllWoodenItems()
	{
		ModelAndView mav = new ModelAndView("showWoodenItemsPage");
		List<WoodenItemBean> wooditemlistvar = woodenItemDAO.getAllWoodenItemsList();
		mav.addObject("Wood_Item_Results", wooditemlistvar);		
		return mav;
	}

	@RequestMapping(value="/updateWoodenItemsList", method=RequestMethod.GET)
	public ModelAndView edit(@RequestParam("woodItem_id")Long woodItem_id)
	{
		ModelAndView mav = new ModelAndView("editWoodenItemsPage");
		WoodenItemBean woodenItemBean = woodenItemDAO.getByItem_Id(woodItem_id);
		mav.addObject("editWoodenItemsPage", woodenItemBean);
		return mav;
	}

	@RequestMapping(value="/updateWoodenItemsList", method=RequestMethod.POST)
	public String update(@ModelAttribute("editWoodenItemsPage") WoodenItemBean woodenItemBean, BindingResult result, SessionStatus status)
	{
		woodenItemDAO.update(woodenItemBean);
		status.setComplete();
		return "redirect:viewWoodenItemsPage.do";
	}	

	@RequestMapping(value="/saveWoodenItemInList", method=RequestMethod.GET)
	public ModelAndView newuserForm()
	{
		ModelAndView mav = new ModelAndView("newWoodenItemPage");
		WoodenItemBean woodenItemBean = new WoodenItemBean();
		mav.getModelMap().put("newWoodenItemPage", woodenItemBean);
		return mav;
	}		

	@RequestMapping(value="/saveWoodenItemInList", method=RequestMethod.POST)
	public String create(@ModelAttribute("newWoodenItemPage") WoodenItemBean woodenItemBean, BindingResult result, SessionStatus status)
	{
		if(true){
			System.out.println("******************************************************");
		}
		woodenItemDAO.save(woodenItemBean);
		status.setComplete();		
		return "redirect:viewWoodenItemsPage.do";

	}	


	@RequestMapping(value ="/removeWoodenItemFromList", method = RequestMethod.GET)
	public String deleteContact(@RequestParam("woodItem_id")Long woodItem_id) {

		woodenItemDAO.delete(woodItem_id);		
		return "redirect:viewWoodenItemsPage.do";

	}

}

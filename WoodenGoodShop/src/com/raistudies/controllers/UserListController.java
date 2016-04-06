package com.raistudies.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.raistudies.bean.User;


@Controller
public class UserListController {
	
	static final Logger logger = Logger.getLogger(UserListController.class);  
	
/*    private List<User> userList = new ArrayList<User>();

    @RequestMapping(value="/AddUser.do",method=RequestMethod.GET)
    public String showForm(){
    	System.out.println("Inside Add User page *************");
        return "AddUser";
    }

    @RequestMapping(value="/AddUser.do",method=RequestMethod.POST)
    public @ResponseBody String addUser(@ModelAttribute(value="user") User user, BindingResult result ){
        String returnText;
        if(!result.hasErrors()){
            userList.add(user);
            returnText = "User has been added to the list. Total number of users are " + userList.size();
        }else{
            returnText = "Sorry, an error has occur. User has not been added to list.";
        }
        return returnText;
    }

    @RequestMapping(value="/ShowUsers.htm")
    public String showUsers(ModelMap model){
        model.addAttribute("Users", userList);
        return "ShowUsers";
    }*/
	
	private int count = 0;
    @RequestMapping(value="/AddUser.do",method=RequestMethod.GET)
    public String showForm(){
    	
    	logger.info("Inside Add User page *************");
        logger.error("Inside Add User page *************");
    	
    	return "AddUser";
    }

    @RequestMapping(value="/AddUser.do",method=RequestMethod.POST)
    public @ResponseBody String addUser(@ModelAttribute(value="user") User user, BindingResult result ){
        String returnText;
        if(!result.hasErrors()){
        	
            count++;
            returnText = "User has been added to the list. Total number of users are " + count;
        }else{
            returnText = "Sorry, an error has occur. User has not been added to list.";
        }
        return returnText;
    }

    
	
}
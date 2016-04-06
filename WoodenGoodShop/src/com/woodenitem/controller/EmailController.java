package com.woodenitem.controller;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.woodenitem.bean.SubscribeEmailIdBean;
import com.woodenitem.dao.SubscriberEmailListDAO;

@Controller
public class EmailController {	

	@Autowired
	private SubscriberEmailListDAO subscriberEmailListDAO;

	@RequestMapping("/showSubscribePage")
	public ModelAndView getSubscribePage()
	{
		ModelAndView mav = new ModelAndView("SubscribeForm");		
		return mav;
	}


	@RequestMapping(value="/saveforSubscription", method=RequestMethod.POST)
	public String subsfornewsletter(@ModelAttribute("SubscribeForm") SubscribeEmailIdBean subscribeEmailIdBean,
			@RequestParam("user_emailId")String user_emailId, SessionStatus status)
	{		
		subscribeEmailIdBean.setUser_emailId(user_emailId);
		subscriberEmailListDAO.subscribe(subscribeEmailIdBean);
		status.setComplete();
		return "redirect:viewWoodenItemsPage.do";
	}	

	@RequestMapping(value="/removefromSubscription", method=RequestMethod.POST)
	public String unsubsfornewsletter(@ModelAttribute("SubscribeForm") SubscribeEmailIdBean subscribeEmailIdBean,
			@RequestParam("user_emailId")String user_emailId, SessionStatus status)
	{
		String emailId = subscribeEmailIdBean.getUser_emailId();
		System.out.println(emailId);		
		subscribeEmailIdBean.setSubscriber(true);
		subscriberEmailListDAO.unsubscribe(subscribeEmailIdBean);
		status.setComplete();		

		return "redirect:viewWoodenItemsPage.do";
	}	


	@RequestMapping("/showFeedbackPage.do")
	public ModelAndView displayFeedbackPage()
	{
		ModelAndView mav = new ModelAndView("FeedbackForm");

		return mav;
	}		


	@RequestMapping("/showContactUsPage.do")
	public ModelAndView displayContactUsPage()
	{
		ModelAndView mav = new ModelAndView("ContactUs");

		return mav;
	}		


	@RequestMapping("/referWoodenItems.do")
	public ModelAndView displayReferPage(HttpServletRequest request)
	{
		ModelAndView mav = new ModelAndView("ReferForm");
		String woodItem_name = request.getParameter("woodItem_name");
		mav.addObject("itemname", "Best wooden item. Buy "+woodItem_name);

		return mav;
	}


	//private JavaMailSender mailSender;	

	/*@RequestMapping(value="sendEmail",method = RequestMethod.POST)
	public String doSendEmail(HttpServletRequest request) {
		// takes input from e-mail form
		String recipientAddress = request.getParameter("recipient");
		String subject = request.getParameter("subject");
		String message = request.getParameter("message");

		// prints debug info
		System.out.println("To: " + recipientAddress);
		System.out.println("Subject: " + subject);
		System.out.println("Message: " + message);

		// creates a simple e-mail object
		SimpleMailMessage email = new SimpleMailMessage();
		email.setTo(recipientAddress);
		email.setSubject(subject);
		email.setText(message);

		// sends the e-mail
		mailSender.send(email);

		// forwards to the view named "Result"
		return "Result";
	}*/


	@RequestMapping(value="sendReference",method = RequestMethod.POST)
	public String doReferEmail(HttpServletRequest request) {
		final String from = "anandsatyam2007@gmail.com";
		//String to = "anandsatyam2007@gmail.com";
		String to = request.getParameter("recipient");
		String sub = request.getParameter("subject");
		String msgbody = request.getParameter("message");


		String messagehtml = "<i>Greetings!</i><br>";
		messagehtml += "<b>Wish you a nice day!</b><br>";
		messagehtml += msgbody ;
		messagehtml += "<font color=red>is a good item to buy</font>";


		//	String to="anandsatyam2007@gmail.com";//change accordingly

		//Get the session object
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from,"PASSWORD");//change accordingly
			}});

		//compose message
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));//change accordingly
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
			message.setSubject(sub);
			message.setContent(messagehtml,"text/html; charset=utf-8");
			//  message.setText(messagehtml);

			//send message
			Transport.send(message);

			System.out.println("message sent successfully");

		} catch (MessagingException e) {throw new RuntimeException(e);}
		return "redirect:viewWoodenItemsPage.do";

	}



	@RequestMapping(value="sendFeedback",method = RequestMethod.POST)
	public String doSendEmail(HttpServletRequest request) {
		final String from = "anandsatyam2007@gmail.com";
		String to = "anandsatyam2007@gmail.com";
		//String to = request.getParameter("recipient");
		String sub = request.getParameter("subject");
		String msgbody = request.getParameter("message");		

		String messagehtml = "<i>Greetings!</i><br>";
		messagehtml += "<b>Wish you a nice day!</b><br>";
		messagehtml += msgbody;

		//	String to="anandsatyam2007@gmail.com";//change accordingly

		//Get the session object
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from,"PASSWORD");//change accordingly
			}});

		//compose message
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));//change accordingly
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
			message.setSubject(sub);
			message.setContent(messagehtml,"text/html; charset=utf-8");
			//  message.setText(messagehtml);

			//send message
			Transport.send(message);

			System.out.println("message sent successfully");

		} catch (MessagingException e) {throw new RuntimeException(e);}
		return "redirect:viewWoodenItemsPage.do";

	}

}

package com.srccodes.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.srccodes.spring.model.Contacts;
import com.srccodes.spring.service.ContactService;
import com.srccodes.spring.service.ContactServiceImpl;

/**
 * @author Maninder Nanda
 * @version 1.0
 */

@Controller
public class SpringMVCHelloController {
	@Autowired
	public ContactService contactService;
	@RequestMapping("/")
	public String printHelloWorld(Model model) {
		model.addAttribute("message", "Hello World!");

		return "helloWorld";
	}

	@RequestMapping("/verifyLogin")
	public String verifyLogin(Model model) {
		model.addAttribute("message", "LoginVerified!");

		return "helloWorld";
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	   public ModelAndView contacts() {
		System.out.println("Inside SpringMVCHelloController");
	      return new ModelAndView("contact", "contact", new Contacts());
	   }
	   
	   @RequestMapping(value = "/addContact", method = RequestMethod.POST)
	   public String addContact(@ModelAttribute("contact")Contacts contact, 
	   ModelMap model) {
		  System.out.println("Inside addContact");
		  if(contact!=null)
			   System.out.println(contact.toString());
		   else {
			   System.out.println("contact is empty");
		   }
		   if(contactService == null) {
			   contactService = new ContactServiceImpl();
			   System.out.println("contactService is null");
		   }
		  
		   contactService.addContact(contact);
	      model.addAttribute("firstName", contact.getFirstName());
	      model.addAttribute("lastName", contact.getLastName());
	      model.addAttribute("contactID", contact.getContactID());
	      model.addAttribute("email", contact.getEmail());
	      model.addAttribute("phone", contact.getPhone());
	      System.out.println("exiting out now");
	      return "result";
	   }
}

package com.ustglobal.webapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.webapp.beans.Retailer;
import com.ustglobal.webapp.repo.ServiceDAO;

@Controller
public class ProductRetailler {
	
	@Autowired
	private  ServiceDAO service;
	
	
	
	@GetMapping("/register")
	public String registerPage() {

		return "register";

	}// end of register page()

	@PostMapping("/register")
	public String register(Retailer bean,ModelMap map) {

		int check =service.createProfile(bean);
		if(check>0) {
			map.addAttribute("msg", "you are Registered and ID is"+check);
		}else {
			map.addAttribute("msg", "Email is repeated");
		}


		return "login";


	}// end of  register()

	
	
	
	
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}//end of login page

	@PostMapping("/login")
	public String login(int id, String password,HttpServletRequest request) {

		service.login(id, password);
		Retailer bean =service.login(id, password);
		if(bean == null) {
			request.setAttribute("msg","Invalid Crendintial");
			return "login";

		}else {

			HttpSession session =request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}

	}// end of login
	
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {

		session.invalidate();
		return "login";
	}//end of log out()

	
	
	
	@GetMapping("/home")
	public String home(ModelMap map
			,@SessionAttribute(name = "bean",required =false) Retailer bean) {

		if(bean==null) {
			map.addAttribute("msg", "Login First!!!!");
			return "login";
		}else {
			return "home";
		}


	}//end of home()

	@PostMapping("/home")
	public String home() {
		return "home";


	}// end of home()


	@GetMapping("/search")
	public String search(@RequestParam("id") int id,ModelMap map) {

		Retailer bean = service.searcheProduct(id);
		if(bean==null) {
			map.addAttribute("msg", "Data Not Found");

		}else {

			map.addAttribute("bean", bean);
		}
		return "home";

	}// end of search() 
	
	
	@GetMapping("/changepassword")
	public String changePassword( HttpServletRequest request) {

		HttpSession session = request.getSession(false);
		if(session !=null) {
			return "changepassword";

		}else {

			return "login";
		}
	}// end of change password()


	@PostMapping("/changepassword")

	public String changePassword(String password,String confirmpassword,
			@SessionAttribute(name="bean") Retailer bean,ModelMap map) {
		if(password.equals(confirmpassword)) {
			service.changePassword(bean.getId(), password);
			map.addAttribute("msg", "Password change");
		}else {
			map.addAttribute("msg", "password Not Matching");
		}
		return "home";
	}// end of Change Password()






	
	
	

}

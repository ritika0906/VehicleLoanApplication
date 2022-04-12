package com.vechileloanapplication.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController{
	@RequestMapping("/")
	public String index() {
		return "index";
	
	}

	@RequestMapping("/user")
	public String user() {
		return "user";
	}
	
	@RequestMapping("/userlogin")
	public String userlogin() {
		return "userlogin";
	}
	
	@RequestMapping("/userdetails")
	public String userdetails() {
		return "userdetails";
	}
	
	@RequestMapping("/userregister")
	public String userregister() {
		return "userregister";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	@RequestMapping("/adminlogin")
	public String adminlogin() {
		return "adminlogin";
	}
	@RequestMapping("/adminreg")
	public String admin_register() {
		return "adminreg";
	}
	
	@RequestMapping("/detailsafterlogin")
	public String detailsafterlogin() {
		return "detailsafterlogin";
	}
	
	
	
	
	
}
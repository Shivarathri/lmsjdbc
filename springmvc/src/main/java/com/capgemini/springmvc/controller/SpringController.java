package com.capgemini.springmvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.PostConstruct;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.springmvc.bean.User;
@Controller
public class SpringController {
	
	@GetMapping("/hello")
	public String displayHello(ModelMap map) {
		map.addAttribute("hello", "Happy Holi");
		return "hello";
	}
	@GetMapping("/form")
	public String form() {
		System.out.println("FromData");
		return "form";
	}
	@PostMapping("/formdata")
	public String FormData(HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("id"));
		String name =req.getParameter("name");
		String email =req.getParameter("email");

		req.setAttribute("id", id);
		req.setAttribute("name", name);
		req.setAttribute("email", email);
		return "FormData";
	}
	@PostMapping("/requestParam")
	public String submitData(@RequestParam(name="id") int id,
			@RequestParam(name="name") String name,
			@RequestParam(name="eamil") String email, ModelMap map) {

		map.addAttribute("id", id);
		map.addAttribute("name", name);
		map.addAttribute("email", email);
		return "FormData";
	}

	@PostMapping("/submitForm")
	public String submiFormtData(int id, String name, String email, ModelMap map) {

		map.addAttribute("id", id);
		map.addAttribute("name", name);
		map.addAttribute("email", email);
		return "FormData";
	}
	@PostMapping("/submitDto")
	public String submiFormtData(User user, ModelMap map) {

		map.addAttribute("id", user.getId());
		map.addAttribute("name", user.getName());
		map.addAttribute("email", user.getEmail());
		return "FormData";
	}
	@GetMapping("/forward")
	public String forward() {
		return "forward:hello";
	}	
	@GetMapping("/redirect")
	public String redirect() {
		return "redirect:https://www.facebook.com";
	}	
	@GetMapping("/path/{name}")
	public String pathVariable(@PathVariable("name") String name, ModelMap map) {
		map.addAttribute("name", name);
		return "path";
	}
	
	
	@GetMapping("/create-cookie")
	public String createCookie(HttpServletRequest request, HttpServletResponse responce, ModelMap map) {
		Cookie cookie = new Cookie("Actor", "Ali");
		cookie.setMaxAge(24*7*60*60);
		responce.addCookie(cookie);
		
		return "create-cookie";
	}
	@GetMapping("/get-cookie")
	public String getCookie(@CookieValue(name="Ali", required = false) String apikey,  ModelMap map) {
		map.addAttribute("cookieName", apikey);
		return "get-cookie";
	}
	@GetMapping("/handler")
	public String handle() {
		 System.out.println(1/0);
		 return "";
	}
}

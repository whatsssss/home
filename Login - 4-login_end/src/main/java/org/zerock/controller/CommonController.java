package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class CommonController {
	
	@GetMapping("/customLogout")
	public void customLogout() {
		log.info("custom logout......");
	}

	@RequestMapping("/accessError")
	public void accessError() {
		
		log.info("access error page call");
		
	}
	
	@GetMapping("/customLogin")
	public void loginInput(String error, String logout, Model model) {
		
		log.info("error: " + error);

		log.info("logout: " + logout);

		if (error != null) {

		model.addAttribute("error", "Login Error Check Your Account");

		}

		if (logout != null) {

		model.addAttribute("logout", "Logout!!");

		}
		
	}
}

package kl.ly.per.logistic.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	/**
	 * homepage
	 * */
	@RequestMapping("/")
	public String home() {
		return "welcome home";
	}
	
}

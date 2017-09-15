package com.hgy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class HeroApplication {

	@RequestMapping(value = "index")
	public String index(Model model){

		model.addAttribute("a","一天天心情很是美丽");

		return "index";
	}


	public static void main(String[] args) {
		SpringApplication.run(HeroApplication.class, args);
	}
}

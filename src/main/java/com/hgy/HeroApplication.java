package com.hgy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
@MapperScan("com.hgy.mapper")
public class HeroApplication {

	@RequestMapping(value = "login")
	public String index(Model model){

		model.addAttribute("a","一天天心情很是美丽");

		return "login";
	}


	public static void main(String[] args) {
		SpringApplication.run(HeroApplication.class, args);
	}
}

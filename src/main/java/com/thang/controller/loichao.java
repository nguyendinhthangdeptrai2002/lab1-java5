package com.thang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loichao {
	@RequestMapping("index")
	public String index(Model model) {
		String hihi = "t lay mi chay di ";
		model.addAttribute("message",hihi);
		return "index";
	}
}

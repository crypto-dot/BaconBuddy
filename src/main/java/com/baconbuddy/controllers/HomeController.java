package com.baconbuddy.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import com.baconbuddy.models.Person;

@Controller
@RequestMapping({"/","/home"})
public class HomeController {
	@GetMapping()
	public String index(Model model) {
		model.addAttribute("person",new Person());
		return "index";
	}
	@PostMapping("/person")
	public String personSubmit(@ModelAttribute Person person) {
		return "results";
	}
}

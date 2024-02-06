package com.example.gradleTest1.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.gradleTest1.DTO.ContentDto;
import com.example.gradleTest1.DTO.ContentValidator;

@Controller
public class ValController {

	@GetMapping("/inputForm")
	public String input(Model model) {
		model.addAttribute("contentDto", new ContentDto());
		return "contentForm";
	}
	
	@GetMapping("/create")
	public String input(ContentDto contentDto, Model model, BindingResult result) {
		String page = "contentDone";
		
		ContentValidator validator = new ContentValidator();
		validator.validate(contentDto, result);
		if( result.hasErrors() ) {
			page="contentForm";
		}
		return page;
	}
	
}

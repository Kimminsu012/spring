package com.example.gradleTest1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@GetMapping("/")
	public ModelAndView main() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("name","뫅뫅"); // 데이터 넣기
		return mv;
	}
	
	@GetMapping("/test")
	public String test(Model model) {
		model.addAttribute("testKey","태스트중 뫅뫅");
		return "test"; // 보여주고자 하는 페이지 이름
	}
	
	@GetMapping("/form")
	public String formDate() {
		return "form";
	}
	
	@RequestMapping("/input")
	public String input(HttpServletRequest request , Model model) {
		
		String id = request.getParameter("myId");
		String name = request.getParameter("myName");
		
		model.addAttribute("id",id);
		model.addAttribute("name",name);
		
		return "input1";
	}
	
	@GetMapping("/input2")
	public String input(@RequestParam("myId") String id , @RequestParam("myName") String name, Model model) {
		
		model.addAttribute("id",id);
		model.addAttribute("name",name);
		
		return "input2";
	}
	
	@GetMapping("/input3")
	public String input() {
		
	}
	
	
	
}


/*
	모델
	스프링에서 모델은 데이터를 저장하거나 뷰에 전달하기 위한 용도로 사용된다.
	ModelAndView - 데이터와 뷰를 모두 전달할 수 있다. 
	
	Model -  데이터만 전달 가능
	
	사용자 요청에 의한 전달받은 데이터를 다시 사용자 화면에 제공하는 방법은 model 사용 해야한다.
	사용자의 요청에 의한 발생된 데이터는 파라미터로 들어오는데 파라미터는 페이지가 변경되면 사라진다.
	파라미터가 사라지기전에 모델에 저장 해두어야한다.


 */










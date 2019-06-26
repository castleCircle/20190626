package com.example.demo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

//	@GetMapping("/events/{id}")
//	@ResponseBody
//	public Event getEvent(@PathVariable Integer id,@MatrixVariable String name) {
//						  //{id}와 파라미터 명을 같게 맞추지 않으면 @PathVariable("id") Integer Idvalue~~ 이런식으로 작성
//		Event event = new Event();
//		event.setId(id);
//		event.setName(name);
//		return event;
//	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String Test() {
		return "sss";
	}
	
	@PostMapping("/events")
	@ResponseBody
	public Event getEvent(@RequestParam Integer limit) {
		Event event = new Event();
		event.setLimit(limit);
		return event;
	}
	
	@PostMapping("/events2")
	@ResponseBody
	public Event getEvent(@RequestParam Map<String, String> params) {
		Event event = new Event();
		event.setName(params.get("name"));
		return event;
	}
	
	@GetMapping("/events3/form")
	public String eventsForm(Model model) {
		System.out.println("SS");
//		Event newEvent = new Event();
//		newEvent.setLimit(50);
//		model.addAttribute("event",newEvent);
//		return "/events/form";
		return "/events/form";
	}
	
	
}

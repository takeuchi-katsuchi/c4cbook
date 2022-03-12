package jp.co.c4c.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.c4c.service.SampleService;

@Controller
@RequestMapping("/")
public class SampleController {

	@Autowired
    SampleService sampleService;

	@RequestMapping
	public String init(Model model) {

	    model.addAttribute("message", "Hello World");
	    model.addAttribute("now", LocalDateTime.now());
	    // ↓ 追加
	    List<String> fruits = List.of("apple", "banana", "cherry");
	    model.addAttribute("fruits", fruits);
	    // ↑ 追加

	    sampleService.getSampleNames();

		return "sample";
	}
}

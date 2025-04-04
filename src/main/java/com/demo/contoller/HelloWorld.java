package com.demo.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/hello")
public class HelloWorld {

	@GetMapping
	public String getMessage() {
		return "Hello World Bangeluru premchand";
	}
	@GetMapping("/name")
	public String getName() {
		return "premchands reddy";
	}
	@GetMapping("/num")
	public String getNum() {
		return "9348447714";
	}
}

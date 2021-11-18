package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	@GetMapping("/")
	@ResponseBody
	public int add()
	{
		return 5+12;
	}
	
	@GetMapping("/sub")
	@ResponseBody
	public int sub()
	{
		return Math.abs(5-12);
	}
	
	@GetMapping("/mul")
	@ResponseBody
	public int mul()
	{
		return 5*12;
	}
	
	@GetMapping("/div")
	@ResponseBody
	public int div()
	{
		return Math.abs(12/6);
	}

}

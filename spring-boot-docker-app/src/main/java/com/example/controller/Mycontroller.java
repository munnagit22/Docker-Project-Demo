package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Mycontroller 
{

	
	  @GetMapping("/welcome/{name}")
	  public String showMessage(@PathVariable("name") String name)
	  {
		   String msg=   name+  " , Welcome to India......";
		   
		   return msg ;
	  }
	
}

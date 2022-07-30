package com.xworkz.ott.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ContactController {

	public ContactController() {
		System.out.println("Contact Controller is created");
	}

	@PostMapping("/contact.do")
	public String OnContact() {
		System.out.println("OnContact created.........");
		return "contact.html";

	}

}

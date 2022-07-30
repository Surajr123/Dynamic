package com.xworkz.ott.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.ott.dto.OttDTO;
import com.xworkz.ott.service.OttService;

@Component
@RequestMapping("/")
public class OttController {

	@Autowired
	private OttService service;

	public OttController() {
		System.out.println("ottController Created");
	}

//	@PostMapping("/save.do")
//	public String onSave(@RequestParam String ott) {
//		System.out.println("onSave called");
//		System.out.println(ott);
//		return "index.html";
//		
//	}

	@PostMapping("/save.do")
	public String onSave(OttDTO dto) {
		System.out.println("onSave calling");
		System.out.println(dto);
		boolean save = service.validateAndSave(dto);
		System.out.println(save);
		return "index.html";

	}
}

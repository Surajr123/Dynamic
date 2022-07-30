package com.xworkz.ott.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.ott.dao.OttDAO;
import com.xworkz.ott.dto.OttDTO;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class OttServiceImpl implements OttService {

	@Autowired
	private OttDAO dao;

	@Override
	public boolean validateAndSave(OttDTO ottDTO) {

//		String ott = dto.getOtt();
//		String region = dto.getRegion();
//		String subscribe = dto.getSubscribe();
//		int users = dto.getUsers();
//		String language = dto.getLanguage();
//		int since = dto.getSince();
//		boolean status = dto.isStatus();
//
//		if (ott != null && !ott.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*")) {
//			System.out.println("Valid ott");
//		} else {
//			System.out.println("Ivalid ott");
//		}
//
//		if (region != null && !region.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*")) {
//			System.out.println("Valid region");
//		} else {
//			System.out.println("Ivalid region");
//		}
//
//		if (subscribe != null && !subscribe.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*")) {
//			System.out.println("Valid subscribe");
//		} else {
//			System.out.println("Ivalid subscribe");
//		}
//
//		if (since > 0) {
//			System.out.println("Valid since");
//		} else {
//			System.out.println("Invalid since");
//		}
//
//		if (language != null && !language.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*")) {
//			System.out.println("Valid language");
//		} else {
//			System.out.println("Ivalid language");
//		}
		System.out.println("valiodate and save method is running");
		return this.dao.save(ottDTO);
	}

}

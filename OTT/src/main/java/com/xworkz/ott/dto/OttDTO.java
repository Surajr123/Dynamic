package com.xworkz.ott.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OttDTO {

	private String ott;
	private String region;
	private String subscribe;
	private int users;
	private String language;
	private int since;
	private boolean status;

	public OttDTO() {
		System.out.println("Ott created new one from dto");
	}

}

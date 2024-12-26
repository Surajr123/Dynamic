package com.suraj.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatAppBackendApplication {

	public static void main(String[] args)	{
		SpringApplication.run(ChatAppBackendApplication.class, args);
		System.out.println("ChatAppBackendApplication.main Running");
	}

}

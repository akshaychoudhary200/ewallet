package com.gfg.ewallet.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@SpringBootApplication
public class NotificationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NotificationApplication.class, args);
	}

	@Autowired
	JavaMailSenderImpl mailSender;

	@Override
	public void run(String... args) throws Exception {
//		SimpleMailMessage message=new SimpleMailMessage();
//		message.setTo("ewallet.gfg32@gmail.com");
//		message.setSubject("test");
//		message.setText("testtt");
//		mailSender.send(message);
//		System.out.println("sent email");
	}
}

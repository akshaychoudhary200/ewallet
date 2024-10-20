package com.gfg.ewallet.notification.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class MailConfiguration {

    @Bean
    public JavaMailSenderImpl getJavaMailSenderImpl(){
         JavaMailSenderImpl javaMailSender=new JavaMailSenderImpl();
////        javaMailSender.setUsername("ewallet.gfg32@outlook.com");
//        javaMailSender.setPassword("ewallet1234");
////        javaMailSender.setHost("smtp-mail.outlook.com");
////        javaMailSender.setPort(25);
//
//        Properties props=javaMailSender.getJavaMailProperties();
//        props.put("mail.smtp.user","ewallet.gfg32@outlook.com");
//        props.put("mail.smtp.host", "smtp-mail.outlook.com");
//        props.put("mail.smtp.port", "587");
//        props.put("mail.smtp.starttls.enable","true");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.socketFactory.port", "587");
//        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//        props.put("mail.smtp.socketFactory.fallback", "true");
//
//        //javaMailSender.getJavaMailProperties().put("mail.smtp.starttls.enable",true);


        return javaMailSender;
    }

    @Bean
    public ObjectMapper getObjectMapper(){
        return new ObjectMapper();
    }

}

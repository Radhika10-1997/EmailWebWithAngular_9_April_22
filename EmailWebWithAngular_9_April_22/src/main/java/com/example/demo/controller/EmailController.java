//package com.example.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.RequestEntity;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.model.EmailRequest;
//import com.example.demo.service.EmailService;
//
//@RestController
//public class EmailController {
//@Autowired
//private EmailService  emailService;
//	@RequestMapping(value = "/sendmail",method = RequestMethod.POST)
//	public ResponseEntity<String> sendEmail(@RequestBody EmailRequest request)
//	{
//		boolean restult=this.emailService.sendEmail(request.getSubect(),request.getMessage(),request.getTo());
//	
//	if(restult) {
//		return ResponseEntity.ok("send");
//	}else {
//		return ResponseEntity.ok("nosend");
//	}
//}
//
//}
//

//package com.example.demo.service;
//
//import java.net.PasswordAuthentication;
//import java.util.Properties;
//
//import javax.websocket.Session;
//
//import org.apache.logging.log4j.message.Message;
//import org.springframework.stereotype.Service;
//
//import com.sun.jdi.connect.Transport;
//import com.sun.net.httpserver.Authenticator;
//
//@Service
//
//public class EmailService {
// public boolean sendEmail(String subect ,String message, String to) {
//	boolean f=false;
//	String from ="radhikamendhe16@gmail.com";
//	
//	 // variable for mail
//	 String host="smpt.gmail.com";
//	 
//	 //get the system properties
//	 Properties properties =System.getProperties();
//	 System.out.println("Proproperties"+properties);
//	 
//	 
//	 
//	












//HOST SET
//	 properties.put("mail.smpt.host", host);
//	 properties.put("mail.smpt.port", "465");
//	 properties.put("mail.smpt.ssl.enable", "true");
//	 properties.put("mail.smpt.auth", "true");
//String	pass= "Radhika@123";
//	 
//	 //step 1 to get session object 
//	 Session session = Session.getInstance(properties, new Authenticator() {
//		 @Override
//	 protected PasswordAuthentication getPasswordAuthentication() {
//		 return new PasswordAuthentication(from,pass);
//	 } });
//	 session.setDebug(true);
//	 
//	 //step 2:compose the message
//	 MimeMessage m= new MimeMessage(session);
//	 try {
//		 //from email
//		 m.setFrom(from);
//		 
//		 //adding recipient to message
//		 m.addRecipient(Message.RecipientType.To, new InternateAddress(to));
//		
//		 //adding subject to message
//		 m.setSubject(subject);
//		 f=true;
//		 // step 3 : send the message using transport class
//		 Transport.send(m);
//	 } catch (Exception e) {
//		 e.printStackTrace();
//	 }
//		 return f;
//		 
//		 
//		 
//		 
//	 }
//	
//	 
//
//	 
// 
//}

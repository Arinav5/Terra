/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employees;

import java.util.TimerTask;
import java.util.Timer;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class sendEmail extends TimerTask{
    public void run(){
        String host = "smtp.gmail.com";
        final String user = "arinav432@gmail.com";
        final String password = "xxxxxxx";
        String to = "avardanyan9517@bths.edu";

        //Get the session objects
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(user,password);
                    }
                });
        //Compose the message
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject("Terra -- Water Plants Alert");
            message.setText("""
                            You have to water some plants today. Don't forget to login to your Terra 
                            account and complete the tasks""");

            //send the message
            Transport.send(message);

            System.out.println("message sent successfully...");

        } catch (MessagingException e) {e.printStackTrace();}
    }
}
   


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPN.Model;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author theeradonjaroonchon
 */
public class MailSet {
    
    
    public boolean mail(String msg, String email){
         

        final String username = "ppnquiz@gmail.com";
        final String password = "ppn215457";

        Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS
        
        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("from@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(email)
            );
            message.setSubject("Forgot password");
            message.setText(msg);

            Transport.send(message);

            System.out.println("Done");
            return true;

        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return false;
    }
    }
   /* private String topics ;
    private String content ;
    private String recipient ;
    private String toEmail ;
    private final String username = "ppnquiz@gmail.com" ;
    private final String password = "ppn215457" ;

    public MailSet(String topics) {
        this.topics = topics;
    }
    
    public void setMail(String recipient, String content, String toEmail){
        this.content = content ;
        this.recipient = recipient ;
        this.toEmail = toEmail ;
    }
    
    public boolean sendMail(){
        if(getContent() == null || getContent().isEmpty() || getRecipient() == null || getRecipient().isEmpty() || getToEmail() == null || getToEmail().isEmpty()){
            System.out.println("Attribute must not be null");
            return false ;
        }
            Properties prop = new Properties();
            prop.put("mail.smtp.host", "smtp.gmail.com");
            prop.put("mail.smtp.port", "587");
            prop.put("mail.smtp.auth", "true");
            prop.put("mail.smtp.starttls.enable", "true");
            Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });
            try {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("QuizHub"));
                message.setRecipients(
                        Message.RecipientType.TO,
                        InternetAddress.parse(getToEmail())
                );
                message.setSubject("PPN_Project - " + topics);
                message.setText(
                        "Dear " + recipient + ","
                        + "\n\n "
                        + getContent()
                        + "\n\n Thank you, our team :)"
                );
                Transport.send(message);
                System.out.println("Send Complete!");
                return true;
            } catch (MessagingException e) {
                e.printStackTrace();
            }
        return true ;
    }

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }

    @Override
    public String toString() {
        return "MailSet{" + "topics=" + topics + ", content=" + content + ", recipient=" + recipient + ", toEmail=" + toEmail + '}';
}*/


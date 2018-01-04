package com.shivekyle.email;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
/**
 *
 * @author shive
 */
public class SendEmail {
    // below grabs text from login class for user name and password,
    private String user = LoginGUI.user_name.getText();
    private String password = LoginGUI.user_password.getText();
    // ctr
    SendEmail(String to, String sub, String msg) {
        Properties prop = new Properties(); // store info for gmail service
        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.starttls.enable", true);
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        
        // below creates session for javax activation
        
        Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
            // check authentication using above properties
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(user, password);
            }
    
        });
        
        try {
            Message message = new MimeMessage(session);
            
            // below setFrom does not work for secure mail servers, they block this to lower spam
            //message.setFrom(new InternetAddress("blah blah blah") ); // who the message is from, company name, etc.. 
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to) );
            message.setSubject(sub);
            message.setText(msg);
            
            Transport.send(message);
            
            System.out.println("Mail Sent");
            JOptionPane.showMessageDialog(null, "Mail sent!");
        }catch(Exception e) {
            System.out.println(e);
        }
        
    }
}

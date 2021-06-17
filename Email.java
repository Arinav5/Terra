package Employees;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Timer;
import java.util.TimerTask;
public class Email {
    public static void main(String[] args) {
        TimerTask task1 = new sendEmail();
        Timer timer = new Timer();
        System.out.println("Sending email...");
        timer.schedule(task1, 5000);
    }
}
package org.hubson404.pracadomowa6;

import org.hubson404.pracadomowa6.mail.Mail;
import org.hubson404.pracadomowa6.mail.MailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class PracaDomowa6Application {

    public static void main(String[] args) {
        SpringApplication.run(PracaDomowa6Application.class, args);

    }

}

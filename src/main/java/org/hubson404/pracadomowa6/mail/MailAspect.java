package org.hubson404.pracadomowa6.mail;

import lombok.RequiredArgsConstructor;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.hubson404.pracadomowa6.Movie;
import org.springframework.stereotype.Component;

@Aspect
@Component
@RequiredArgsConstructor
public class MailAspect {

    final MailService mailService;

    @After("execution(void org.hubson404.pracadomowa6.MovieService.addMovie(..))")
    private void afterPostMovie(JoinPoint joinPoint){

        Object[] args = joinPoint.getArgs();
        Movie movie = (Movie) args[0];

        Mail mail = new Mail();
        mail.setMailFrom("hubsonjava@gmail.com");
        mail.setMailTo("hubsonjava@gmail.com");
        mail.setMailSubject("Database update");
        mail.setMailContent("Movie added to database: " + movie.getTitle() + " (" + movie.getProductionYear() + ").");

        mailService.sendEmail(mail);
        System.out.println("mail sent");
    }

}

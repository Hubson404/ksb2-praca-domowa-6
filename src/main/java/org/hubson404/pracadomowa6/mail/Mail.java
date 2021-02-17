package org.hubson404.pracadomowa6.mail;

import lombok.Data;

import java.util.List;

@Data
public class Mail {

    private String mailFrom;

    private String mailTo;

    private String mailCc;

    private String mailBcc;

    private String mailSubject;

    private String mailContent;

    private String contentType;

    private List<Object> attachments;

    public Mail() {
        contentType = "text/plain";
    }
}

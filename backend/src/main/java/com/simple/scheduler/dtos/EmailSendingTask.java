package com.simple.scheduler.dtos;

import lombok.Data;

@Data
public class EmailSendingTask {
    private String recipient;
    private String subject;
    private String body;
}
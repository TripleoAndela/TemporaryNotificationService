package com.example.temporarynotificationservice.controller;

import com.example.temporarynotificationservice.dto.EmailRequest;
import com.example.temporarynotificationservice.service.NotificationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class NotificationController {

    private NotificationService emailService;

    // Sending a simple Email
    @PostMapping("/notification/v1/sendMail")
    public String
    sendMail(@RequestBody EmailRequest emailRequest)
    {
        String status
                = emailService.sendSimpleMail(emailRequest);

        return status;
    }

}

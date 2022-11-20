package com.example.temporarynotificationservice.service;

import com.example.temporarynotificationservice.dto.EmailRequest;

public interface NotificationService {

    String sendSimpleMail(EmailRequest details);

}

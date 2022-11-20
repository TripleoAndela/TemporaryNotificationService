package com.example.temporarynotificationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailRequest {

    // Class data members
    private String recipient;
    private String msgBody;
    private String subject;
}

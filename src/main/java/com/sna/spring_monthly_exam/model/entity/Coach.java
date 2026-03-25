package com.sna.spring_monthly_exam.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Coach {
    private Integer coachId;
    private String coachName;
    private String email;
}

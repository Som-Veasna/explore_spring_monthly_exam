package com.sna.spring_monthly_exam.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CoachRequest {
    private String coachName;
    private String email;
}

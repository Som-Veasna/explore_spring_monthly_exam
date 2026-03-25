package com.sna.spring_monthly_exam.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlayerRequest {
    private String playerName;
    private Double salary;
    private  Integer teamId;


}

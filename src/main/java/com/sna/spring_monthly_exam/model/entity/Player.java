package com.sna.spring_monthly_exam.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Player {
    private Integer playerId;
    private String playerName;
    private Double salary;


}

package com.sna.spring_monthly_exam.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Team {
    private Integer teamId;
    private String teamName;
    private Coach coach;
    private List<Player> players;

}

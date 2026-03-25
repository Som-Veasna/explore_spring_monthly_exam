package com.sna.spring_monthly_exam.model.request;

import com.sna.spring_monthly_exam.model.entity.Coach;
import com.sna.spring_monthly_exam.model.entity.Player;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class TeamRequest {
    private String teamName;
    private Integer coachId;
    private List<Integer> playerId;

}

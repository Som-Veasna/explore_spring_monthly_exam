package com.sna.spring_monthly_exam.controller;

import com.sna.spring_monthly_exam.model.entity.Team;
import com.sna.spring_monthly_exam.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/team")
public class TeamController {
    private final TeamService teamService;

    @GetMapping
    public List<Team> GetAllTeam() {
        return teamService.getAllTeams();
    }
}

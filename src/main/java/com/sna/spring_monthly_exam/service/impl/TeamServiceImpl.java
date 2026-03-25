package com.sna.spring_monthly_exam.service.impl;

import com.sna.spring_monthly_exam.model.entity.Team;
import com.sna.spring_monthly_exam.repository.TeamRepository;
import com.sna.spring_monthly_exam.service.TeamService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TeamServiceImpl implements TeamService {
    private final TeamRepository teamRepository;

    @Override
    public List<Team> getAllTeams() {
        return teamRepository.GetAllTeam();
    }
}

package com.sna.spring_monthly_exam.service.impl;

import com.sna.spring_monthly_exam.model.entity.Player;
import com.sna.spring_monthly_exam.model.request.PlayerRequest;
import com.sna.spring_monthly_exam.repository.PlayerRepository;
import com.sna.spring_monthly_exam.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class PlayerServiceImpl implements PlayerService {
    private final PlayerRepository playerRepository;
    @Override
    public List<Player> getPlayers() {
        return playerRepository.getAllPlayers();
    }

    @Override
    public Player getPlayerById(Integer playerId) {
        return playerRepository.getPlayerById(playerId);
    }

    @Override
    public Player UpdatePlayerById(Integer playerId, PlayerRequest playerRequest) {
        return null;
    }

    @Override
    public Player CreatePlayer(PlayerRequest playerRequest) {
        return playerRepository.CreatePlayer(playerRequest);
    }
}

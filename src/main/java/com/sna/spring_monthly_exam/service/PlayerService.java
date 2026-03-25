package com.sna.spring_monthly_exam.service;

import com.sna.spring_monthly_exam.model.entity.Player;
import com.sna.spring_monthly_exam.model.request.PlayerRequest;

import java.util.List;

public interface PlayerService {
    List<Player> getPlayers();
    Player getPlayerById(Integer playerId);
    Player UpdatePlayerById(Integer playerId, PlayerRequest playerRequest);
    Player CreatePlayer(PlayerRequest playerRequest);
}

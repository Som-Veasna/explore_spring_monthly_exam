package com.sna.spring_monthly_exam.controller;

import com.sna.spring_monthly_exam.model.entity.Player;
import com.sna.spring_monthly_exam.model.request.PlayerRequest;
import com.sna.spring_monthly_exam.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/player")
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService playerService;
    @GetMapping
    public List<Player> getPlayers() {
        return playerService.getPlayers();
    }
    @PostMapping
    public Player CreatePlayer(@RequestBody PlayerRequest playerRequest) {
        return playerService.CreatePlayer(playerRequest);
    }
    @GetMapping("/{player-id}")
   private Player getPlayerById(@PathVariable("player-id") Integer playerId) {
        return playerService.getPlayerById(playerId);
    }

}

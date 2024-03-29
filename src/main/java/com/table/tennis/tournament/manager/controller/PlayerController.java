package com.table.tennis.tournament.manager.controller;

import com.table.tennis.tournament.manager.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/player")
@AllArgsConstructor
public class PlayerController {

    private final PlayerService playerService;

    @GetMapping("/men-ranking")
    public ResponseEntity<?> getMenRanking() {
        return ResponseEntity.ok().body(playerService.getMenRanking());
    }
}

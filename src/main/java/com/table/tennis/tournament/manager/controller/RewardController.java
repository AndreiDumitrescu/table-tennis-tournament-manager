package com.table.tennis.tournament.manager.controller;

import com.table.tennis.tournament.manager.service.RewardService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reward")
@AllArgsConstructor
public class RewardController {

    private final RewardService rewardService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok().body(rewardService.getAll());
    }
}

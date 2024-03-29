package com.table.tennis.tournament.manager.service;

import lombok.AllArgsConstructor;
import com.table.tennis.tournament.manager.model.entity.Reward;
import org.springframework.stereotype.Service;
import com.table.tennis.tournament.manager.repository.RewardRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class RewardService {

    private final RewardRepository rewardRepository;

    public List<Reward> getAll() {
        return rewardRepository.findAll();
    }
}

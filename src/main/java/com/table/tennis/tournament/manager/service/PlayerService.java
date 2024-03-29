package com.table.tennis.tournament.manager.service;

import com.table.tennis.tournament.manager.model.entity.Player;
import com.table.tennis.tournament.manager.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayerService {

    private final PlayerRepository playerRepository;

    public List<Player> getMenRanking() {
        return playerRepository.findMenRanking();
    }
}

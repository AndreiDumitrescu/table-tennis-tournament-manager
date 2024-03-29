package com.table.tennis.tournament.manager.repository;

import com.table.tennis.tournament.manager.model.entity.Reward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardRepository extends JpaRepository<Reward, Integer> {
}

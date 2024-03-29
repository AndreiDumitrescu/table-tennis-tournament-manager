package com.table.tennis.tournament.manager.repository;

import com.table.tennis.tournament.manager.model.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
    @Query("""
            SELECT p FROM Player p
            WHERE p.sex = 'M'
            ORDER BY p.points DESC
            """)
    List<Player> findMenRanking();
}

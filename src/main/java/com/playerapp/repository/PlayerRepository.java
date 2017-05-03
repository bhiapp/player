package com.playerapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.playerapp.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}

package com.playerapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.playerapp.model.Player;
import com.playerapp.repository.PlayerRepository;

@RestController
@RequestMapping("players")
public class PlayerController {

	@Autowired
	private PlayerRepository playerRepository;

	@GetMapping
	public List<Player> getPlayers() {
		return playerRepository.findAll();
	}

	@PostMapping
	public Player createPlayer(@RequestBody Player player) {
		return playerRepository.save(player);
	}

	@PutMapping
	public Player updatePlayer(@RequestBody Player player) {
		return playerRepository.save(player);
	}

	@DeleteMapping(path = "/{playerId}")
	public ResponseEntity<HttpStatus> deletePlayer(@PathVariable("playerId") Long playerId) {
		playerRepository.delete(playerId);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}

}

package com.pedroalmeida.repositoryservice.controller;

import com.pedroalmeida.repositoryservice.model.Game;
import com.pedroalmeida.repositoryservice.service.GameService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/games")
@RequiredArgsConstructor
public class GameController {
    private final GameService gameService;

    @GetMapping
    public Flux<Game> getAllGames() {
        log.debug("Retrieving call from gamebuddy-svc to retrieve all games");
        return gameService.getAllGames();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Game> createGame(@RequestBody Game game) {
        log.info("Creating new game: {}", game);
        return gameService.createGame(game);
    }

    @PutMapping("/{id}")
    public Mono<Game> updateGame(@PathVariable Long id, @RequestBody Game game) {
        //log.info("Updating game with id {}: {}", id, game);
        return gameService.updateGame(id, game);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteGame(@PathVariable Long id) {
        //log.info("Deleting game with id: {}", id);
        return gameService.deleteGame(id);
    }
}

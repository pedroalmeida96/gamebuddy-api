package com.pedroalmeida.gamebuddyservice.controller;


import com.pedroalmeida.gamebuddyservice.model.Game;
import com.pedroalmeida.gamebuddyservice.service.GameService;
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
        log.debug("Retrieving all games from repository-service");
        return gameService.getAllGames();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Game> createGame(@RequestBody Game game) {
        return gameService.createGame(game);
    }

    @PutMapping("/{id}")
    public Mono<Game> updateGame(@PathVariable String id, @RequestBody Game game) {
        return null;
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteGame(@PathVariable String id) {
        return gameService.deleteGame(id);

    }
}

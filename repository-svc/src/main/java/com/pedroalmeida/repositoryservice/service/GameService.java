package com.pedroalmeida.repositoryservice.service;


import com.pedroalmeida.repositoryservice.exception.GameNotFoundException;
import com.pedroalmeida.repositoryservice.model.Game;
import com.pedroalmeida.repositoryservice.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
@RequiredArgsConstructor
public class GameService {
    private final GameRepository gameRepository;

    public Flux<Game> getAllGames() {
        return gameRepository.findAll()
                .doOnNext(game -> log.debug("Retrieved game {} w/ location {}", game.getId(), game.getLocation()))
                .doOnError(error -> log.error("Error while retrieving all games", error));
    }

    public Mono<Game> createGame(Game game) {
        log.info("Saving new game to repository: {}", game);
        return gameRepository.save(game);
    }

    public Mono<Game> updateGame(Long id, Game game) {
        log.info("Updating game with id {} in repo: {}", id, game);
        return gameRepository.findById(id)
                .switchIfEmpty(Mono.error(new GameNotFoundException("Game not found with id " + id)))
                .map(existingGame -> {
                    existingGame.setLocation(game.getLocation());
                    return existingGame;
                })
                .flatMap(gameRepository::save);
    }

    public Mono<Void> deleteGame(Long id) {
        log.info("Deleting game with id {} from repository", id);
        return gameRepository.deleteById(id);
    }
}

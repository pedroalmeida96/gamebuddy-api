package com.pedroalmeida.gamebuddyservice.service;



import com.pedroalmeida.gamebuddyservice.client.RepositoryServiceClient;
import com.pedroalmeida.common.Game;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
@RequiredArgsConstructor
public class GameService {
    private final RepositoryServiceClient repositoryServiceClient;

    public Flux<Game> getAllGames() {
        return repositoryServiceClient.getAllGames();
    }

    public Mono<Game> createGame(Game game) {
        return repositoryServiceClient.createGame(game);
    }

    public Mono<Game> updateGame() {
        return null;
    }

    public Mono<Void> deleteGame(String id) {
        return repositoryServiceClient.deleteGame(id);
    }
}

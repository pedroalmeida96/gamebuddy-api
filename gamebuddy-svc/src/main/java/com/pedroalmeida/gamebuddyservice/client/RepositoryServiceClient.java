package com.pedroalmeida.gamebuddyservice.client;

import com.pedroalmeida.gamebuddyservice.model.Game;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class RepositoryServiceClient {
    private final WebClient client;

    public RepositoryServiceClient(WebClient.Builder builder) {
        this.client = builder.baseUrl("http://localhost:8081").build();
    }

    public Flux<Game> getAllGames() {
        return client.get().uri("/games")
                .retrieve()
                .bodyToFlux(Game.class);
    }

    public Mono<Game> createGame(Game game) {
        return client.post().uri("/games")
                .body(Mono.just(game), Game.class)
                .retrieve()
                .bodyToMono(Game.class);
    }


    public Mono<Void> deleteGame(String id) {
        return client.delete().uri("/games/" + id)
                .retrieve()
                .bodyToMono(Game.class).then();
    }

}

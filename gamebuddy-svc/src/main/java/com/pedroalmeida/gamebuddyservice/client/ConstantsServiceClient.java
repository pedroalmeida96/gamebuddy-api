package com.pedroalmeida.gamebuddyservice.client;

import com.pedroalmeida.gamebuddyservice.model.Game;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

@Component
public class ConstantsServiceClient {
    private final WebClient client;

    public ConstantsServiceClient(WebClient.Builder builder) {
        this.client = builder.baseUrl("http://localhost:8082").build();
    }

    public Mono<Map<String, List<String>>> getAllGameTypes() {
        return client.get()
                .uri("/gameType")
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<>() {
                });
    }

    public Mono<Game> createGame(Game game) {
        return client.post().uri("/games").body(Mono.just(game), Game.class).retrieve().bodyToMono(Game.class);
    }


    public Mono<Void> deleteGame(String id) {
        return client.delete().uri("/games/" + id).retrieve().bodyToMono(Game.class).then();
    }

}

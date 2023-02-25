package com.pedroalmeida.gamebuddyservice.controller;

import com.pedroalmeida.gamebuddyservice.client.ConstantsServiceClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/gameType")
@RequiredArgsConstructor
public class GameTypeController {

    private final ConstantsServiceClient constantsServiceClient;

    @GetMapping
    public Mono<Map<String, List<String>>> getAllGames() {
        log.debug("Retrieving all games from repository-service");
        return constantsServiceClient.getAllGameTypes();
    }

}

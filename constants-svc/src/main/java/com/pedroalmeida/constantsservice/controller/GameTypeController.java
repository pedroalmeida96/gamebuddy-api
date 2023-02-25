package com.pedroalmeida.constantsservice.controller;

import com.pedroalmeida.constantsservice.service.GameTypeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/gameType")
@RequiredArgsConstructor
public class GameTypeController {
    private final GameTypeService gameTypeService;

    @GetMapping
    public Mono<Map<String, List<String>>> getAllGames() {
        log.debug("GET request from gamebuddy-svc to retrieve all game types");
        return gameTypeService.getGameTypes();
    }
}




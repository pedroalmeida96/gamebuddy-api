package com.pedroalmeida.constantsservice.controller;

import com.pedroalmeida.constantsservice.service.GameTypeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@Slf4j
@RequestMapping("/gameType")
@RequiredArgsConstructor
public class GameTypeController {
    private GameTypeService gameTypeService;

    @GetMapping
    public Flux<String> getAllGames() {
        return gameTypeService.getAllGameTypes();
    }
}




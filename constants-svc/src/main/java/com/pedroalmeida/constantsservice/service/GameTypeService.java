package com.pedroalmeida.constantsservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class GameTypeService {

    public Flux<String> getAllGameTypes() {
        log.debug("Retrieving all game types");
        List<String> gameTypes = Arrays.asList("Football", "Basketball");
        return Flux.fromIterable(gameTypes);
    }
}

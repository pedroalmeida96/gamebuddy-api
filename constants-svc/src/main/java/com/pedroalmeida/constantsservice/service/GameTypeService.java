package com.pedroalmeida.constantsservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class GameTypeService {

    public Mono<Map<String, List<String>>> getGameTypes() {
        List<String> gameTypes = Arrays.asList("Football", "Basketball");
        Map<String, List<String>> result = new HashMap<>();
        result.put("gameTypes", gameTypes);
        return Mono.just(result);
    }
}

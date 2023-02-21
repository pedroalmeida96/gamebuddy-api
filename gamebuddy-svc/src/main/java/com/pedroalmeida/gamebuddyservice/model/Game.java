package com.pedroalmeida.gamebuddyservice.model;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder
@Data
public class Game {
    private String id;
    private String location;
}

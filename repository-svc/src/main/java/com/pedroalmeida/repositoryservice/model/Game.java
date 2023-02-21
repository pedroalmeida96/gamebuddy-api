package com.pedroalmeida.repositoryservice.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Jacksonized
@Builder
@Data
@Document(collection = "games")
public class Game {
    @Id
    private String id;
    @NotBlank
    private String location;
}

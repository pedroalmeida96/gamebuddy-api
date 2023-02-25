package com.pedroalmeida.repositoryservice.repository;

import com.pedroalmeida.repositoryservice.model.Game;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends ReactiveCrudRepository<Game, String> {
}

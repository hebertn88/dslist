package com.hbtnasc.dslist.repositories;

import com.hbtnasc.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {


}

package com.hbtnasc.dslist.controllers;

import com.hbtnasc.dslist.dto.GameMinDTO;
import com.hbtnasc.dslist.entities.Game;
import com.hbtnasc.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;
    @GetMapping
    public List<GameMinDTO> findAll(){
        List<Game> result = gameService.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}

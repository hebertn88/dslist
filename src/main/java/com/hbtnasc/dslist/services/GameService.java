package com.hbtnasc.dslist.services;

import com.hbtnasc.dslist.dto.GameMinDTO;
import com.hbtnasc.dslist.entities.Game;
import com.hbtnasc.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<Game> findAll(){
        List<Game> result = gameRepository.findAll();
        return result;
    }
}

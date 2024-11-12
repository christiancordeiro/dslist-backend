package com.projectgames.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projectgames.dslist.dto.GameDTO;
import com.projectgames.dslist.dto.GameListDTO;
import com.projectgames.dslist.dto.GameMinDTO;
import com.projectgames.dslist.entities.Game;
import com.projectgames.dslist.entities.GameList;
import com.projectgames.dslist.repositories.GameListRepository;
import com.projectgames.dslist.repositories.GameRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
	}
}

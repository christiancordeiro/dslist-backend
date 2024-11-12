package com.projectgames.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectgames.dslist.dto.GameDTO;
import com.projectgames.dslist.dto.GameListDTO;
import com.projectgames.dslist.dto.GameMinDTO;
import com.projectgames.dslist.entities.Game;
import com.projectgames.dslist.services.GameListService;
import com.projectgames.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
}
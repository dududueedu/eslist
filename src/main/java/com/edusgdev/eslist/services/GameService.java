package com.edusgdev.eslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edusgdev.eslist.dto.GameMinDTO;
import com.edusgdev.eslist.entities.Game;
import com.edusgdev.eslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(a -> new GameMinDTO(a)).toList();
		return dto;
	}
}

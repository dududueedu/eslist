package com.edusgdev.eslist.dto;

import com.edusgdev.eslist.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;
	
	public GameListDTO() {}
	
	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}

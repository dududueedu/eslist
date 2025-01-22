package com.edusgdev.eslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edusgdev.eslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}

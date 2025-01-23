package com.edusgdev.eslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.edusgdev.eslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}

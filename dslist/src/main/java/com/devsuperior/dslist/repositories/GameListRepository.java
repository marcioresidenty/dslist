package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.GameList;

// e um coponente do sistema que tem os componentes basicos 
public interface GameListRepository extends JpaRepository<GameList, Long>{

}

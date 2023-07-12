package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

// e um coponente do sistema que tem os componentes basicos 
public interface GameRepository extends JpaRepository<Game, Long>{

}

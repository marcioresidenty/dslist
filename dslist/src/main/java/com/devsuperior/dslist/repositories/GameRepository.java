package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

// e um coponente do sistema 
public interface GameRepository extends JpaRepository<Game, Long>{

}

package com.datajpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.datajpa.entity.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer> {

}

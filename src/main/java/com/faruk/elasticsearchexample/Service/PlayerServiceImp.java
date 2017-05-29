/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faruk.elasticsearchexample.Service;

import com.faruk.elasticsearchexample.domain.Players;
import com.faruk.elasticsearchexample.searchRepository.PlayerSearchRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Faruk
 */
@Service
public class PlayerServiceImp implements PlayerService{
    
    private PlayerSearchRepository playerSearchRepository;
    
    @Autowired
    public void setPlayerSearchRepository(PlayerSearchRepository playerSearchRepository){
        this.playerSearchRepository = playerSearchRepository;
    }

    @Override
    public Players save(Players players) {
        return playerSearchRepository.save(players);
    }

    @Override
    public void delete(Players players) {
        playerSearchRepository.delete(players);
    }

    @Override
    public Players findOne(Long id) {
        return playerSearchRepository.findOne(id);
    }

    @Override
    public List<Players> findOneByFirstName(String firstName) {
        return playerSearchRepository.findByFirstName(firstName);
    }
    
    @Override
    public Iterable<Players> findAll() {
        return playerSearchRepository.findAll();
    }
    
}

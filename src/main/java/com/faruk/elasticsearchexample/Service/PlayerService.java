/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faruk.elasticsearchexample.Service;

import com.faruk.elasticsearchexample.domain.Players;
import java.util.List;

/**
 *
 * @author Faruk
 */
public interface PlayerService {
    
    Players save(Players players);
    
    void delete(Players players);
    
    Players findOne(Long id);
    
    List<Players> findOneByFirstName(String firstName);
    
    Iterable<Players> findAll();
    
}

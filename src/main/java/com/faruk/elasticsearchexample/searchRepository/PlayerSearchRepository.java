/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faruk.elasticsearchexample.searchRepository;

import com.faruk.elasticsearchexample.domain.Players;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 *
 * @author Faruk
 */
public interface PlayerSearchRepository extends ElasticsearchRepository<Players, Long>{
    
    List<Players> findByFirstName(String firstName);
    
}

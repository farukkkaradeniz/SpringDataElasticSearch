/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faruk.elasticsearchexample;

import com.faruk.elasticsearchexample.Service.PlayerService;
import com.faruk.elasticsearchexample.domain.Players;
import java.util.Map;
import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;

/**
 *
 * @author Faruk
 */
@SpringBootApplication
public class ElasticSearchApplication implements CommandLineRunner {

    @Autowired
    private ElasticsearchOperations es;

    @Autowired
    private PlayerService playerService;

    public static void main(String[] args) {
        SpringApplication.run(ElasticSearchApplication.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception {

        printElasticSearchInfo();

//        playerService.save(new Players(Long.valueOf("1"), "Wesley", "Sneijder", "Playing for Galatasaray"));
//        playerService.save(new Players(Long.valueOf("2"), "Selçuk", "İnan", "Playing for Galatasaray"));
//        playerService.save(new Players(Long.valueOf("3"), "Felipe", "Melo", "Played for Galatasaray"));
        
        Iterable<Players> allItems = playerService.findAll();
        
        System.out.println(playerService.findOne(Long.valueOf("1")).getExtraInformation());
    }

    //useful for debug, print elastic search details
    private void printElasticSearchInfo() {

        System.out.println("--ElasticSearch--");
        Client client = es.getClient();
        Map<String, String> asMap = client.settings().getAsMap();

        asMap.forEach((k, v) -> {
            System.out.println(k + " = " + v);
        });
        System.out.println("--ElasticSearch--");
    }

}

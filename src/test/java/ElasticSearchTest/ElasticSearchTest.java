/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElasticSearchTest;

import com.faruk.elasticsearchexample.ElasticSearchApplication;
import com.faruk.elasticsearchexample.Service.PlayerService;
import com.faruk.elasticsearchexample.domain.Players;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author Faruk
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ElasticSearchApplication.class)
public class ElasticSearchTest {
    
    @Autowired
    private PlayerService playerService;
    
    @Test
    @Ignore
    public void insertRecord(){
    
        playerService.save(new Players(1453L, "Faruk", "Karadeniz", "Software Developer"));
        
    }
    
    @Test
    @Ignore
    public void getAllRecords(){
    
        Iterable<Players> players = playerService.findAll();
        
        System.out.println(players.iterator().next().getFirstName());
        
    }
    
    @Test
    public void getPlayerByName(){
    
        long start = System.currentTimeMillis();
        List<Players> player = playerService.findOneByFirstName("Faruk");
        System.out.println(player.get(0).getLastName());
        System.out.println(System.currentTimeMillis() - start);
    }
    
}

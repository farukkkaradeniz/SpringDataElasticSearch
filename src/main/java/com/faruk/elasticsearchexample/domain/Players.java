/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faruk.elasticsearchexample.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 *
 * @author Faruk
 */
@Document(indexName = "players")
public class Players {
    
    @Id
    private Long id;
    
    private String firstName;
    
    private String lastName;
    
    private String extraInformation;

    public Players(Long id, String firstName, String lastName, String extraInformation) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.extraInformation = extraInformation;
    }

    public Players() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExtraInformation() {
        return extraInformation;
    }

    public void setExtraInformation(String extraInformation) {
        this.extraInformation = extraInformation;
    }
    
}

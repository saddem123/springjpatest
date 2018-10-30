package com.example.demo.entity;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;

@Entity
public class Provider {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true)
    private String name;
    private String ville;
    private String email;
    private Integer numTel;



    public Provider(String name, String ville, String email, Integer numTel) {
        this.name = name;
        this.ville = ville;
        this.email = email;
        this.numTel = numTel;
    }
    public Provider(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNumTel() {
        return numTel;
    }

    public void setNumTel(Integer numTel) {
        this.numTel = numTel;
    }
}

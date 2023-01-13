package com.example.thepathproject2.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class City {

    @Id
    @GeneratedValue

    private int id;

    private String name;

    private List <Place> places;
}

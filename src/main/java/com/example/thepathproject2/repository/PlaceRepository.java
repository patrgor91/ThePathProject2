package com.example.thepathproject2.repository;

import com.example.thepathproject2.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository <Place, Integer> {

}

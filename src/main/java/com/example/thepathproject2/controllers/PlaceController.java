package com.example.thepathproject2.controllers;

import com.example.thepathproject2.entities.Place;
import com.example.thepathproject2.models.PlaceType;
import com.example.thepathproject2.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PlaceController {

    @Autowired
    private PlaceRepository placeRepository;

    @GetMapping(value = "/fakeplace/{fakeplaceId}")
    public @ResponseBody Place getFakePlace(@PathVariable Integer placeId) {
        Place place = new Place(PlaceType.RESTAURANT);
        place.setId(placeId);
        place.setName("La Catina");
        return place;
    }

    @GetMapping(value = "/place/{placeId}")
    public @ResponseBody Place getPlace(@PathVariable Integer placeId) {
        return placeRepository.findById(placeId).get();
    }
}

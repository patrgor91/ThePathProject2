package com.example.thepathproject2.controllers;

import com.example.thepathproject2.entities.Place;
import com.example.thepathproject2.models.PlaceType;
import com.example.thepathproject2.repository.PlaceRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PlaceController {

    @Autowired
    private PlaceRepository placeRepository;
    private Map<Long, Place> places = new HashMap<>();

//    @GetMapping(value = "/fakeplace/{fakeplaceId}")
//    public @ResponseBody
//    Place getFakePlace(@PathVariable Integer placeId) {
//        Place place = new Place(PlaceType.RESTAURANT);
//        place.setId(placeId);
//        place.setName("La Catina");
//        return place;


    //CREATE
    @PostMapping(value = "/places")
    public void createPlace (@RequestBody Place place) {
      placeRepository.save(place);
    }

    // UPDATE
    @PutMapping(value = "/places/{placeId}")
    public Place updatePlace(@RequestBody Place place, @PathVariable Integer placeId) {
        return placeRepository.save(place);
    }

    @GetMapping(value = "/places/{placeId}")
    public @ResponseBody Place getPlace(@PathVariable Integer placeId) {
        /*
        PlaceRepository repository = placeRepository; // tworze zmienna repository typu PlaceReposiory, ktora odpowiada za zarzadzanie obiektami place w bazie danych
        Optional<Place> dbResponse = repository.findById(placeId); // chce pobracplace z konkretnym id z bazy danych i zwracany jest m obiekt ty[u optional z placem w srodku
        Place place = dbResponse.get(); // wyciagam obiekt place z odpowiedzi ktora dostalam w bazie danych
        return place;
         */

        return placeRepository.findById(placeId).get(); // skrocona wersja tego powyzej
    }

    //READ
    @GetMapping(value = "/places") //dlaczego
    public @ResponseBody List<Place> getAllPlaces() {
        return placeRepository.findAll();
    }


    //DELETE
    @DeleteMapping("/places/{placeId}")
    public @ResponseBody void deletePlace(@PathVariable Integer placeId) {
        placeRepository.deleteById(placeId);
    }
}

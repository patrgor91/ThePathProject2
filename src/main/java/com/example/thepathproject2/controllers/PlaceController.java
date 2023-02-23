package com.example.thepathproject2.controllers;

import com.example.thepathproject2.dto.PlaceDto;
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

@RestController
public class PlaceController {

    @Autowired
    private PlaceRepository placeRepository;

    //CREATE - OK
    @PostMapping(value = "/places")
    public void createPlace (@RequestBody PlaceDto placeDto) {
        Place place = PlaceDto.mapToPlace(placeDto);
        placeRepository.save(place);

//        @PostMapping(value = "/places")
//        public void createPlace (@RequestBody Place place) {
//            placeRepository.save(place);
    }

    // UPDATE - OK
    @PutMapping(value = "/places/{placeId}")
     public void updatePlace(@RequestBody PlaceDto placeDto, @PathVariable Integer placeId) {
        Place place = PlaceDto.mapToPlace(placeDto);
        place.setId(placeId);
        placeRepository.save(place);
    }
//        public Place updatePlace(@RequestBody PlaceDto placeDto, @PathVariable Integer placeId) {
//        return placeRepository.save(place);

    // GET
    @GetMapping(value = "/places/{placeId}")
    public @ResponseBody PlaceDto getPlaceDto(@PathVariable Integer placeId) {
        Place place = placeRepository.findById(placeId).get();
        return Place.mapToPlaceDto(place); // skrocona wersja tego powyzej
    }
    /*
      PlaceRepository repository = placeRepository; // tworze zmienna repository typu PlaceReposiory, ktora odpowiada za zarzadzanie obiektami place w bazie danych
      Optional<Place> dbResponse = repository.findById(placeId); // chce pobracplace z konkretnym id z bazy danych i zwracany jest m obiekt ty[u optional z placem w srodku
      Place place = dbResponse.get(); // wyciagam obiekt place z odpowiedzi ktora dostalam w bazie danych
      return place;
       */
    //public @ResponseBody Place getPlace(@PathVariable Integer placeId) {
     //   return placeRepository.findById(placeId).get(); // skrocona wersja tego powyzej

    //READ
    @GetMapping(value = "/places") //dlaczego
    public @ResponseBody List<PlaceDto> getAllPlaces() {
        Place place = placeRepository.findAll();
        return PlaceDto.mapToPlaceDto();
        //Place place = PlaceDto.mapToPlace(placeDto);
       // return placeRepository.findAll();
    }


    //DELETE
    @DeleteMapping("/places/{placeId}")
    public @ResponseBody void deletePlace(@PathVariable Integer placeId) {
        placeRepository.deleteById(placeId);
    }
}

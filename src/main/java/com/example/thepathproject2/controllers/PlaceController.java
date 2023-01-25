package com.example.thepathproject2.controllers;

import com.example.thepathproject2.entities.Place;
import com.example.thepathproject2.models.PlaceType;
import com.example.thepathproject2.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;


@Controller
public class PlaceController {

    @Autowired
    private PlaceRepository placeRepository;

    @GetMapping(value = "/fakeplace/{fakeplaceId}")
    public @ResponseBody
    Place getFakePlace(@PathVariable Integer placeId) {
        Place place = new Place(PlaceType.RESTAURANT);
        place.setId(placeId);
        place.setName("La Catina");
        return place;
    }

    @GetMapping(value = "/places/{placeId}")
    public @ResponseBody
    Place getPlace(@PathVariable Integer placeId) {
        /*
        PlaceRepository repository = placeRepository; // tworze zmienna repository typu PlaceReposiory, ktora odpowiada za zarzadzanie obiektami place w bazie danych
        Optional<Place> dbResponse = repository.findById(placeId); // chce pobracplace z konkretnym id z bazy danych i zwracany jest m obiekt ty[u optional z placem w srodku
        Place place = dbResponse.get(); // wyciagam obiekt place z odpowiedzi ktora dostalam w bazie danych
        return place;
         */

        return placeRepository.findById(placeId).get(); // skrocona wersja tego powyzej
    }

   @GetMapping(value = "/places") //dlaczego
    public @ResponseBody List<Place> getAllPlaces() {
        return placeRepository.findAll();
    }
}

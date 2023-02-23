package com.example.thepathproject2.dto;

import com.example.thepathproject2.entities.Place;
import com.example.thepathproject2.models.PlaceType;

public class PlaceDto {

    public String name;
    public String zipcode;
    public String street;
    public String city;
    public PlaceType placeType;


    public static Place mapToPlace(PlaceDto placeDto) {
            Place place = new Place(
                    placeDto.getName(),
                    placeDto.getZipcode(),
                    placeDto.getStreet(),
                    placeDto.getCity(),
                    placeDto.getPlaceType()
            );
            return place;
        }

    public static PlaceDto mapToPlaceDto(Place place) {
        PlaceDto placeDto = new PlaceDto(
                place.getName(),
                place.getZipcode(),
                place.getStreet(),
                place.getCity(),
                place.getPlaceType()
        );
        return placeDto;
    }
    public PlaceDto(String name, String zipcode, String street, String city, PlaceType placeType) {
        this.name = name;
        this.zipcode = zipcode;
        this.street = street;
        this.city = city;
        this.placeType = placeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public PlaceType getPlaceType() {
        return placeType;
    }

    public void setPlaceType(PlaceType placeType) {
        this.placeType = placeType;
    }
}

//wciele metody createPlace utworz zmienna typu place ktora
// bezie zawierala dane z obiektu place dto i ten obiekt nowo utworziny wykona save
// natomiast w metodzie update to samo

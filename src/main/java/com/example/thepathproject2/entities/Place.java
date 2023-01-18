package com.example.thepathproject2.entities;

import com.example.thepathproject2.models.PlaceType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

    @Entity
    @Table(name = "PLACE")
    public class Place {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String name;
        private String zipcode;
        private String street;
        private String city;

        public Place() {
        }

        public Place(PlaceType placeType) {
            this.placeType = placeType;
        }

        @Enumerated(EnumType.STRING)
        private PlaceType placeType;

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



//        private List<Comment> comments;
//        private List<Note> notes;
}

package com.example.thepathproject2.entities;

import com.example.thepathproject2.models.Comment;
import com.example.thepathproject2.models.Note;
import com.example.thepathproject2.models.PlaceType;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


    @Data
    @NoArgsConstructor
    @Entity
    public class Place {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        private String name;
        private String zipcode;
        private String street;
        private String city;

//        @Enumerated(EnumType.STRING)
//        private PlaceType placeType;
//
//        private List<Comment> comments;
//        private List<Note> notes;
}

package com.example.thepathproject2.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Posts {

    private Integer id;

    private String text;

    private String createdAt;

    private String modifiedAt;

    private String comments;

}

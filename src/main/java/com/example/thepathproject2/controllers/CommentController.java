package com.example.thepathproject2.controllers;

import com.example.thepathproject2.entities.Comment;

import com.example.thepathproject2.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;

    @GetMapping(value = "/comment/{commentId}")
    public @ResponseBody Comment getComment(@PathVariable Integer commentId) { //zdefiniowanie czy jest
        return commentRepository.findById(commentId).get(); //wykonuje strzal do bazy danych, to obiekt o konkretnym id, to co pokazuje mi sie w przegladarce
    }
}
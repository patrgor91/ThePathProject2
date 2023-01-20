package com.example.thepathproject2.controllers;


import com.example.thepathproject2.entities.Comment;
import com.example.thepathproject2.entities.Note;
import com.example.thepathproject2.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;

    @GetMapping(value = "/note/{noteId}")
    public @ResponseBody
    Note getNote(@PathVariable Integer noteId) {
        Note note = new Note();
        note.setId(noteId);
        note.setNote(5);
        return note;
    }
}

package com.example.thepathproject2.repository;

import com.example.thepathproject2.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;



public interface NoteRepository extends JpaRepository<Note,Integer> {
}

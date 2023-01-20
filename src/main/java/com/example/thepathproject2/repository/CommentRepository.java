package com.example.thepathproject2.repository;


import com.example.thepathproject2.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Integer> {

}

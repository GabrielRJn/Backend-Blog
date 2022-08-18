package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Post;

@Repository
public interface repository extends JpaRepository<Post, Long> {
//controller will interact with service that interacts with database
}

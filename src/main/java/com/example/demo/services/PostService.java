package com.example.demo.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.*;
import com.example.demo.repo.repository;

@Service
public class PostService {

	
	
	@Autowired
	private repository postRepository;
	
	public Optional<Post> getById(Long id){
		return postRepository.findById(id);
	}
	
	public List<Post> getAll(){
		return postRepository.findAll();
	}
	public Post save(Post post) {
		if(post.getId() == null) {
			post.setCreatedAt(LocalDateTime.now());
		}
		return postRepository.save(post);
		
	}
	
	
	}

	



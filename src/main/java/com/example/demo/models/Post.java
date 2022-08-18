package com.example.demo.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.*;
//automatically generate getters and setters for class
@Entity
@Getter
@Setter 
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String title;

	@Column(columnDefinition = "TEXT")
	private String body;
	
	private LocalDateTime createdAt;

}

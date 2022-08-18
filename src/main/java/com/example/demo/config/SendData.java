package com.example.demo.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.models.Post;
import com.example.demo.services.PostService;



@Component
public class SendData implements CommandLineRunner {

	
	@Autowired
	private PostService postService;
	
	@Override
	public void run(String...args) throws Exception{
		List<Post> posts = postService.getAll();
		if (posts.size() == 0) {
			Post post1 = new Post(); //if there are no posts make defaults
			post1.setTitle("title of post 1");
			post1.setBody("body of post 1");
			
			Post post2 = new Post();
			post2.setTitle("hello");
			post2.setBody("my name is gab");
			
			postService.save(post1);
			postService.save(post2);
			
	
			
		}
	}
	
}

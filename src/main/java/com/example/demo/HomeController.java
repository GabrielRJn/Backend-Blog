package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.models.Post;
import com.example.demo.services.PostService;

@Controller
public class HomeController {

	
	@Autowired
	private PostService postService;
	
	
	@GetMapping("/")
	public String home(Model model) {
		List<Post> posts = postService.getAll();
		model.addAttribute("posts", posts);
		return "home"; //our template
	}
}

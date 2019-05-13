package org.sfanpro.blog.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.sfanpro.blog.models.Post;
import org.sfanpro.blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@Autowired
	private PostService postService;

	@RequestMapping("/")
	public String index(Model model) {
		List<Post> lastestFivePosts = postService.findLastestFive();
		model.addAttribute("lastest5posts", lastestFivePosts);

		List<Post> lastestThreePosts = lastestFivePosts.stream().limit(3).collect(Collectors.toList());
		model.addAttribute("lastest3posts", lastestThreePosts);
		return "index";
	}
}

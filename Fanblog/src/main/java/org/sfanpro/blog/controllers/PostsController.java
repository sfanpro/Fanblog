package org.sfanpro.blog.controllers;

import org.sfanpro.blog.models.Post;
import org.sfanpro.blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostsController {

	@Autowired
	private PostService postService;

	@RequestMapping("/posts/view/{id}")
	public String view(@PathVariable("id") Long id, Model model) {
		Post post = postService.findById(id);
		model.addAttribute("post", post);
		return "post/view";
	}
}

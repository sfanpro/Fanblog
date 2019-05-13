package org.sfanpro.blog.services;

import java.util.List;

import org.sfanpro.blog.models.Post;

public interface PostService {
	List<Post> findAll();

	List<Post> findLastestFive();

	Post findById(Long id);

	Post create(Post post);

	Post edit(Post post);

	void deleteById(Long id);

}

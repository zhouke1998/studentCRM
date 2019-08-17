package com.mypack.service;

import java.util.List;
import com.mypack.model.Post;

public interface PostService {
	List<Post> getPost(Post post);

	int getPostNumber(Post post);

	String insPost(Post post);
	
	Post getPostById(int id);
	
	String updatePost(Post post);
	
	String deletePost(int id);
}

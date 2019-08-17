package com.mypack.mapper;

import java.util.List;
import com.mypack.model.Post;

public interface PostMapper {
	List<Post> getPost(Post post);

	int getPostNumber(Post post);
	
	int insPost(Post post);
	
	Post getPostById(int id);
	
	int updatePost(Post post);
	
	int deletePost(int id);
}

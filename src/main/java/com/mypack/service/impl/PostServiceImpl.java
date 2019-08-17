package com.mypack.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.mypack.mapper.PostMapper;
import com.mypack.model.Post;
import com.mypack.service.PostService;
@Service
public class PostServiceImpl implements PostService{
	@Resource
	private PostMapper postMapper;

	@Override
	public List<Post> getPost(Post post){
		if (post.getPage()!=-1) {
			int start = (post.getPage() - 1) * 5;
			post.setPage(start);
		}
		return postMapper.getPost(post);
	}

	@Override
	public int getPostNumber(Post post) {
		return postMapper.getPostNumber(post);
	}

	@Override
	public String insPost(Post post) {
		return postMapper.insPost(post)==1?"OK":"NO";
	}

	@Override
	public Post getPostById(int id) {
		return postMapper.getPostById(id);
	}

	@Override
	public String updatePost(Post post) {
		return postMapper.updatePost(post)==1?"OK":"NO";
	}

	@Override
	public String deletePost(int id) {
		return postMapper.deletePost(id)==1?"OK":"NO";
	}
}

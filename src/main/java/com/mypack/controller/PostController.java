package com.mypack.controller;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mypack.model.Post;
import com.mypack.service.PostService;

@Controller
public class PostController{
	@Resource
	private PostService postServiceImpl;
	
	@RequestMapping("/ajax/getPost")
	@ResponseBody
	public List<Post> getPost(Post post){
		return postServiceImpl.getPost(post);
    }
	
	@RequestMapping("/index/post")
	String stuHref(){
		return "/index/pos_t.html";
	}

	@RequestMapping("/ajax/getPostNumber")
	@ResponseBody
	public int getPostNumber(Post post){
		return postServiceImpl.getPostNumber(post);
	}
	
	@RequestMapping("/ajax/createPost")
	@ResponseBody
	public String createPost(Post post){
		return postServiceImpl.insPost(post);
    }
	
	@RequestMapping("/ajax/getPostById")
	@ResponseBody
	public Post getPostById(int id){
		return postServiceImpl.getPostById(id);
    }
	
	@RequestMapping("/ajax/updatePost")
	@ResponseBody
	public String updatePost(Post post){
		return postServiceImpl.updatePost(post);
    }
	
	@RequestMapping("/ajax/deletePost")
	@ResponseBody
	public String deletePost(int id){
		return postServiceImpl.deletePost(id);
    }
}

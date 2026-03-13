package com.madhan.joblisting.controller;

import com.madhan.joblisting.model.Post;
import com.madhan.joblisting.repository.PostRepository;
import com.madhan.joblisting.repository.SearchRepository;
import io.swagger.v3.oas.annotations.Hidden;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class PostController {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository searchRepo;

    @Hidden
    @RequestMapping("/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/index.html");
    }

    @GetMapping("/allPosts")
    @CrossOrigin
    public List<Post> getAllPosts(){
        return repo.findAll();
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){
        return searchRepo.findByText(text);
    }

    @PostMapping("/post")
    public Post addPosts(@RequestBody Post post){
        return repo.save(post);
    }
}

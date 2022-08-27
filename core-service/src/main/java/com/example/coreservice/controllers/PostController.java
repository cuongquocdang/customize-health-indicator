package com.example.coreservice.controllers;

import com.example.coreservice.dtos.PostDTO;
import com.example.coreservice.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping
    public List<PostDTO> retrieveAllPosts() {
        return postService.retrieveAllPosts();
    }

}

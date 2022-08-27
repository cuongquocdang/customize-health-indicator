package com.example.coreservice.services;

import com.example.coreservice.dtos.PostDTO;

import java.util.List;

public interface PostService {

    List<PostDTO> retrieveAllPosts();
}

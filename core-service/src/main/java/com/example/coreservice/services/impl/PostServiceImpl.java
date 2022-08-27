package com.example.coreservice.services.impl;

import com.example.coreservice.clients.JSONPlaceHolderClient;
import com.example.coreservice.dtos.PostDTO;
import com.example.coreservice.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final JSONPlaceHolderClient jsonPlaceHolderClient;

    @Override
    public List<PostDTO> retrieveAllPosts() {
        return jsonPlaceHolderClient.getPosts();
    }
}

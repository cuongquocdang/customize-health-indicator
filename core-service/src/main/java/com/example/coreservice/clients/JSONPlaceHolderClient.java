package com.example.coreservice.clients;

import com.example.coreservice.dtos.PostDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "jsonPlaceHolderClient", url = "https://jsonplaceholder.typicode.com/")
public interface JSONPlaceHolderClient {

    @GetMapping("/posts")
    List<PostDTO> getPosts();
}

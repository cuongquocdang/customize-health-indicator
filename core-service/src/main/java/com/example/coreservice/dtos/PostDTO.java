package com.example.coreservice.dtos;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PostDTO {

    private Long id;

    private String userId;
    private String title;
    private String body;
}

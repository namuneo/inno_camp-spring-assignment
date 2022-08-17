package com.sparta.assginment.domian;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

@Getter
public class PostRequestDto {
    private String title;
    private String username;
    private String content;
    private String password;
}

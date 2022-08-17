package com.sparta.assginment.domian;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor // 기본 생성자를 만듭니다.
@Getter
@Entity
public class Post extends TImestamped { // Timestamped는 생성, 수정 시간을 자동으로 만들어줌
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    @Column(nullable = false) // 제목
    private String title;

    @Column(nullable = false) // 작성자명
    private String username;

    @JsonIgnore
    @Column(nullable = false) // 작성 내용
    private String content;


    @Column(nullable = false) // 비밀번호
    private String password;

    public Post(String title, String username, String content) {
        this.title = title;
        this.username = username;
        this.content = content;
    }


    public Post(PostRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.username = requestDto.getUsername();
        this.content = requestDto.getContent();
        this.password = requestDto.getPassword();
    }


    public void update(PostRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.username = requestDto.getUsername();
        this.content = requestDto.getContent();
        this.content = requestDto.getPassword();
    }
}
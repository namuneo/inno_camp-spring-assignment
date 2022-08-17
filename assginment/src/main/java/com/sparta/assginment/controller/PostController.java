package com.sparta.assginment.controller;

import com.sparta.assginment.domian.Post;
import com.sparta.assginment.domian.PostRepository;
import com.sparta.assginment.domian.PostRequestDto;
import com.sparta.assginment.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostController {
    private final PostRepository postRepository; // 생성, 조회, 삭제
    private final PostService postService; // 변경

    // 전체 게시글 조회
    @GetMapping("/api/posts")
    public List<Post> getPost() {
        return postRepository.findAllByOrderByCreatedAtDesc();
    }

    // 게시글 작성
    @PostMapping("/api/posts")
    public Post createMemo(@RequestBody PostRequestDto requestDto) {
        Post post = new Post(requestDto);
        return postRepository.save(post);
    }

    // 삭제
    @DeleteMapping("/api/posts/{id}")
    public Long deletePost(@PathVariable Long id) { // 경로에 있는 변수를 받기 위해 @PathVariable 사용
        postRepository.deleteById(id);
        return id;
    }

    // 수정
    @PutMapping("/api/posts/{id}")
    public Long updatePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto) { // @RequestBody request 안에 body라는 녀석을 받아 와야 하는 구나
        postService.update(id, requestDto);
        return id;
    }
}

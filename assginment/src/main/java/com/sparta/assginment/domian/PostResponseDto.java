package com.sparta.assginment.domian;


import lombok.Builder;
import lombok.Getter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;


@EntityListeners(AuditingEntityListener.class)
@Getter
public class PostResponseDto extends TImestamped{
    private String title;
    private String username;
    private String content;

    @Builder
    public PostResponseDto(Post post) {
        super.createdAt = post.createdAt;
        this.title = post.getTitle();
        this.username = post.getUsername();
        this.content = post.getContent();
    }

}

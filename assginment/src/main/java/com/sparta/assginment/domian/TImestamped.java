package com.sparta.assginment.domian;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter // createdAt과 modifiedAt이 private 클래스 이기 떄문에 @Getter 필수
@MappedSuperclass // Entity가 createdAt과 modifiedAt을 자동으로 컬럼으로 인식(추가)한다.
@EntityListeners(AuditingEntityListener.class) // 생성/변경을 시간을 자동으로 업데이트 한다.
public abstract class TImestamped { // abstract는 상송이 되어야지만 사용할 수 있는 클래스

    @CreatedDate
    protected LocalDateTime createdAt; // LocalDateTime은 시간을 나타내는 자료형 생성 잘짜

    @JsonIgnore
    @LastModifiedDate
    private LocalDateTime modifiedAt; // 수정 시간
}

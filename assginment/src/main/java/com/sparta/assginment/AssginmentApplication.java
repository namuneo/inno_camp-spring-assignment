package com.sparta.assginment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // spring 한테 우리 JPA 쓸 건데 뭔가 데이터 변동이 있으면 그거 꼭 JPA가 알아서 반영 하도록 해줘 생성/수정 시간이 바뀌 었을 떄 자동으로 업데이트가 된다.
@SpringBootApplication
public class AssginmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssginmentApplication.class, args);
    }

}

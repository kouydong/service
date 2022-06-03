package com.apti.service.common;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // 해당 클래스를 상속 받는 경우 필드들을 컬럼으로 인식
public class BaseTimeEntity {

    // Entity가 생성되어 저장될 때 시간이 자동으로 저장
    @CreatedDate
    private LocalDateTime createdDate;

    // 조회된 Entity의 값이 변경될 때 시간이 자동으로 저장
    @LastModifiedDate
    private LocalDateTime modifiedDate;

}

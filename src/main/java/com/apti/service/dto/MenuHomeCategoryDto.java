package com.apti.service.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class MenuHomeCategoryDto {


    //@NotEmpty(message ="이메일은 필수 입력 값입니다.")
    private String mblToken;    // 토큰 값

    //@NotBlank(message = "이름은 필수 입력 값입니다.")
    private String code;        // 아파트코드

    //@NotEmpty(message ="이메일은 필수 입력 값입니다.")
    private String cateCode;    // 카테고리코드

    //@NotEmpty(message ="비밀번호는 필수 입력 값입니다.")
    //@Length(min=8, max=16, message="비밀번호는 8자 이상, 16자 이하로 입력해 주세요")
    private String gubu;    // 메뉴구분

    //@NotEmpty(message="주소는 필수 입력 값입니다")
    private String parents; // 부모창링크및이름

    /*
    private String cname;       // 카테고리명
    @Column(nullable=false)
    private String position;    // 메뉴트리 구조(구분값 1 : 최상위, 2 : 1차 서브)
    @Column(length=400)
    private String memo;        // 간단설명
    private String linkUrl;     // 링크주소
    private String linkGubu;    // 링크구분 (1 : 새창, 2 : 본창, 3 : 본문)
    private String fname1;      // 타이틀이미지
    private String fname2;      // 배경색상
    @Column(nullable=false)
    private String outp;        // 숨김여부(N : 숨김, Y : 노출)
    @Column(nullable=false)
    private String hidden;      // 숨김여부(Y : 숨김, N : 노출)
    private int sort;           // 1차소트
    @Column(nullable=false)
    private int mLevel;         // 접근권한
    private String secret;      // 보안서버유지
    @Column(nullable=false)
    private String reg;         // 등록일
    private int tabSort;        // 확인불가
    private String groupCode;   // 확인불가
    private String tabName;     // 확인불가
    private String mobHiddenYn; // 확인불가
    private String mobMenu;     // APT-I Y : 비노출, N : 노출
    */


}

package com.apti.service.entity;

import com.apti.service.entity.AeMemberDamo;
import com.apti.service.entityKey.AeMemberDamoPK;
import com.apti.service.entityKey.MenuhomeCategoryPK;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
@Entity
@Table(name="menuhome_category")
@IdClass(MenuhomeCategoryPK.class) //복합키 사용 시 사용
public class MenuhomeCategory{

    @Id
    private String code;        // 아파트코드
    @Id
    private String cateCode;    // 카테고리코드
    private String gubu;        // 메뉴구분
    @Column(nullable=false)
    private String parents;     // 부모창링크및이름
    private String cname;       // 카테고리명
    @Column(nullable=false)
    private String position;    // 메뉴트리 구조(구분값 1 : 최상위, 2 : 1차 서브)
    @Column(length=400)
    private String memo;        // 간단설명
    private String linkurl;     // 링크주소
    private String linkgubu;    // 링크구분 (1 : 새창, 2 : 본창, 3 : 본문)
    private String fname1;      // 타이틀이미지
    private String fname2;      // 배경색상
    @Column(nullable=false)
    private String outp;        // 숨김여부(N : 숨김, Y : 노출)
    @Column(nullable=false)
    private String hidden;      // 숨김여부(Y : 숨김, N : 노출)
    private int sort;           // 1차소트
    @Column(nullable=false)
    private int mlevel;         // 접근권한
    private String secret;      // 보안서버유지
    @Column(nullable=false)
    private String reg;         // 등록일
    private int tabsort;        // 확인불가
    private String groupcode;   // 확인불가
    private String tabname;     // 확인불가
    private String mobhiddenyn; // 확인불가
    private String mobmenu;     // APT-I Y : 비노출, N : 노출
}

package com.apti.service.entity;

import com.apti.service.entityKey.AeMemberDamoPK;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="ae_member_damo")
@Getter @Setter
@ToString
@IdClass(AeMemberDamoPK.class) //복합키 사용 시 사용

public class AeMemberDamo {

    @Id
    private String userid;              // 사용자 ID
    @Id
    private String code;                // 아파트코드
    @Column(name="gubu", nullable=false)
    private String gubu;                // I:입주민,E:비입주민,U:업체회원,D:영업대행사,[Z:지사(일단) ,G:구청, S:sk브로드밴드,K:지역난방공사 => 4개는 apti에서 로그인불가.]
    private String mblToken;            // 토큰값
    @Column(name="pwd")
    private String pwd;                 // 패스워드  => 13.02.21 단방향 암호화 처리
    @Column(nullable=false)
    private String pwdHint;             // etc 테이블 코드값에서 추출 password
    @Column(nullable=false)
    private String pwdAnswer;           // 답변
    @Column(nullable=false)
    private String name;                // 사용자유저명
    private String nickname;            // 사용자닉네임
    private String secJumin;            // 주민번호
    @Column(nullable=false)
    private String birthdayGubu;        // 1:양력 2:음력
    @Column(nullable=false)
    private String birthday;            // 생년월일 1955-08-24
    @Column(nullable=false)
    private String email;               // 이메일
    @Column(nullable=false)
    private String tel;                 // 전화번호
    @Column(nullable=false)
    private String zipcode;             // 우편번호(자동등록),일반회원 직접등록
    @Column(nullable=false)
    private String addr1;               // 주소(자동등록) 일반회원 직접등록
    @Column(nullable=false)
    private String addr2;               // 주소(자동등록) 일반회원 직접등록
    private String smsYn;               // Y:수신<->N
    private String emailYn;             // Y:수신<->N
    private String donghomeinsert;      // Y:직접등록 N:선택등록(정확함!!)
    @Column(nullable=false)
    private String aptDong;             // 동 비입주민시
    @Column(nullable=false)
    private String aptHo;               // 호 비입주민시
    @Column(nullable=false)
    private String seName;              // 세대주이름
    @Column(nullable=false)
    private String seChk;               // 세대주이름
    @Column(name = "car_n")
    private int carN;                   // 차량대수
    private String carNum;              // 차량정보 구분자
    private String job;                 // 직업 => Y:직원회원(이지스) Else 회원
    private String jobName;             // 직장명
    private String jobPosition;         // 직위
    private String zisacode;            // 지사코드 (ae_etc) zisa :관련테이블(yong_manager(common_bbs),apt_info(zisaCode))
    private String whereis;             // 가입경로
    private int login;                  // 로그인횟수
    private String relogin;             // 최근 로그인날짜
    private String regdate;             // 등록일
    private String outcontent;          // 탈퇴사유
    private String outdate;             // 탈퇴일 or 휴면전환일
    private String outYn;               // APTi 탈퇴회원 Y:탈퇴회원 <-> N
    private int mLevel;                 // 회원권한 :총관리자 등록은 ygn2만..걍 hard코딩
    private String telecom;             // LGT,SKT,KTF
    private String marketing1;          // 현재 라이나생명 제3자 동의안
    private String whereis2;            // 가입경로 (ae_etc) title : whereis2
    private String foregubu;            // 외국인구분 1:내국인 2:외국인 9:알수없음(소셜로그인)
    private String ipinci;              // iPin 공개키
    private String ipindi;              // 회원중복체크는 Di값으로 한다.
    private String sex;                 // 성별 : 0:여자,1:남자 9:알수없음(소셜로그인)
    private String authgubu;            // 인증구분:I:아이핀,J:실명인증(외국인은 이것밖에 없음),S:소셜로그인
    private String recomid;             // 추천인 아이디
    private String daninfoagree;        // 단지 홈페이지 정보제공동의 Y:제공 N:미제공
    private String daninfoagreedt;      // 단지 정보제공 동의/미동의 날짜  NULL:아무것도 선택안한사람 / 로그인하면 1회만 뜨도록 하기위해서 뜨면 날짜update
    private String danoutYn;            // 단지 홈페이지 탈퇴여부 Y:탈퇴 <-> N
    private String stopaccountYn;       // T:휴면회원 개인정보 분리부관된 회원(복구가능) <-> N => 휴면계정으로 변경은 배치서버에서 이루어짐.,Y:완전탈퇴
    private String shopiinfoagree;      // SHOPi 홈페이지 정보제공동의 Y:제공 N:미제공
    private String shopiinfoagreedt;    // SHOPi 정보제공 동의/미동의 날짜
    private String shopioutYn;          // SHOPi 홈페이지 탈퇴여부 Y:탈퇴 <-> N
    private String aptiinfoagree;       // apti 홈페이지 정보제공동의 Y:제공 N:미제공
    private String aptiinfoagreedt;     // apti 정보제공 동의/미동의 날짜
    private String aptioutYn;           // apti 홈페이지 탈퇴여부 Y:탈퇴 <-> N
    private String foreverout;          // Y:영구탈퇴 <-> N,Y로 되어 있으면 ipinCi,ipinDi값 삭제하면안됨.
    private String foreveroutdate;      // 영구탈퇴 처리일
    private String rowId;               // 확인불가
    private String jumin;               // 확인불가

}

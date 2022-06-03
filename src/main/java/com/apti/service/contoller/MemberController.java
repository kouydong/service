package com.apti.service.contoller;

import ch.qos.logback.classic.Logger;
import com.apti.service.dto.AeMemberDto;
import com.apti.service.entity.AeMemberDamo;
import com.apti.service.repository.AeMemberDamoRepository;
import com.apti.service.service.AeMemberDamoService;
import com.apti.service.service.MenuHomeCategoryService;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class MemberController {
    //─────────────────────────────────────────────────────────────────────────────────────────────────
    //  로그파일 위치
    //─────────────────────────────────────────────────────────────────────────────────────────────────
    Logger logger = (Logger) LoggerFactory.getLogger(MemberController.class);
    //─────────────────────────────────────────────────────────────────────────────────────────────────
    //  서비스 객체 생성
    //─────────────────────────────────────────────────────────────────────────────────────────────────
    private final AeMemberDamoService aeMemberDamoService;
    /*─────────────────────────────────────────────────────────────────────────────────────────────────
    작성일 : Apr 26th 2022
    작성자 : 고의동
    역할   : 사용자 메뉴 정보 조회
    비고   : mblToken 값으로 내용 조회
     ─────────────────────────────────────────────────────────────────────────────────────────────────*/
    @GetMapping("/member/{mblToken}")
    public String test(@PathVariable("mblToken") String mblToken) {
        //─────────────────────────────────────────────────────────────────────────────────────────────
        logger.info("mblToken ===>  " + mblToken);
        //─────────────────────────────────────────────────────────────────────────────────────────────
        //  Service 로직 추가 필요
        //─────────────────────────────────────────────────────────────────────────────────────────────
        /*"{"my_activity" : ["title":아파트소식", "url":"http", "type":"엠단 or 닷넷"],
        "manage_cost" : ["title":조회", "url":"http", "type":"엠단 or 닷넷"],
        "cash" : ["title":전환", "url":"http", "type":"엠단 or 닷넷"],
        "life" : ["title":민원관리", "url":"http", "type":"엠단 or 닷넷"],
        "finance" : ["title":신용점수 올리기", "url":"http", "type":"엠단 or 닷넷"]
        }*/
        //─────────────────────────────────────────────────────────────────────────────────────────────
        AeMemberDto reqDto = new AeMemberDto();
        //─────────────────────────────────────────────────────────────────────────────────────────────
        //entity.selectAllSQL(mblToken);
        //─────────────────────────────────────────────────────────────────────────────────────────────
        //entity.findMemberMenu(mblToken);
        //─────────────────────────────────────────────────────────────────────────────────────────────
        List<AeMemberDamo> aeMemberDamoList  = aeMemberDamoService.findMemberInfo(mblToken);
        //─────────────────────────────────────────────────────────────────────────────────────────────
        /*
        public String orderHist(Principal principal, Model model){
            List<CartDetailDto> cartDetailList = cartService.getCartList(principal.getName());
            model.addAttribute("cartItems", cartDetailList);
            return "cart/cartList";
        }
        */
        Gson gson1 = new Gson();
        //─────────────────────────────────────────────────────────────────────────────────────────────
        String jsonStr = gson1.toJson(aeMemberDamoList);
        System.out.println("JSON Contents ==>" + jsonStr);
        //─────────────────────────────────────────────────────────────────────────────────────────────
        return jsonStr;
        //─────────────────────────────────────────────────────────────────────────────────────────────
    }
}

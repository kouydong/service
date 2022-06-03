package com.apti.service.service;

import com.apti.service.entity.AeMemberDamo;
import com.apti.service.repository.AeMemberDamoRepository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class AeMemberDamoService {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    AeMemberDamoRepository amdRepo;

    public List findMemberInfo(String mblToken) {
        //─────────────────────────────────────────────────────────────────────────────
        //  mblToken 값을 기준으로 사용자 정보를 조회
        //─────────────────────────────────────────────────────────────────────────────
        System.out.println("1111 ==>" + mblToken);
        List<AeMemberDamo> aeMemberDamo = amdRepo.findByMblToken(mblToken);

        System.out.println("2222");
        //─────────────────────────────────────────────────────────────────────────────
        //Gson aa = new Gson();
        // Gson aa = new Gson();
        // Gson gson1 = new Gson();
        //GsonBuilder gson2 = new GsonBuilder().create();
        // Gson gson3 = new GsonBuilder().setPrettyPrinting().create();

//─────────────────────────────────────────────────────────────────────────────
        return aeMemberDamo;
    }



}



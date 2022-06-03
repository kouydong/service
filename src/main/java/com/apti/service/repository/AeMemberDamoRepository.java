package com.apti.service.repository;

import com.apti.service.entity.AeMemberDamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


public interface AeMemberDamoRepository extends JpaRepository<AeMemberDamo, Long>  {


    @Query(value="select top 10 * from ae_member_damo ae where ae.mbl_token = :mblToken ", nativeQuery = true)
    List<AeMemberDamo> findByMblToken(@Param("mblToken") String mblToken);

}

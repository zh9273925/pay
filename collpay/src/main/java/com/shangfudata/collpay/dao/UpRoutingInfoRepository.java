package com.shangfudata.collpay.dao;

import com.shangfudata.collpay.entity.DownRoutingInfo;
import com.shangfudata.collpay.entity.UpRoutingInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;

/**
 * Created by tinlly to 2019/4/1
 * Package for com.shangfu.pay.service.dao
 */
public interface UpRoutingInfoRepository extends JpaRepository<UpRoutingInfo, Integer>, JpaSpecificationExecutor<UpRoutingInfo>, Serializable {

    @Query("from UpRoutingInfo where mch_id = ?1 and sp_id = ?2")
    UpRoutingInfo queryOne(String mchId, String spId);

}
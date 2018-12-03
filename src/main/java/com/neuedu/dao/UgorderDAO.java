package com.neuedu.dao;

import com.neuedu.bean.Ugorder;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;

public interface UgorderDAO {
    List<Ugorder> selectAll();
    List<Ugorder> selectOne(@Param("oid") Integer oid);
    List<Ugorder> selectSuccess();
    List<Ugorder> selectUnDelivery();//查找未发货
    void pay(@Param("oid") Integer oid, @Param("paydate") Date date);//付款
    void delivery(@Param("oid") Integer oid, @Param("deliverydate") Date date);//发货
    void finish(@Param("oid") Integer oid,@Param("finishdate") Date date);//完成订单

//    Boolean Soifpay(@Param("oid") Integer oid);
//    Boolean Soifdelivery(@Param("oid") Integer oid);
//    Boolean Soiffinish(@Param("oid") Integer oid);
//    Boolean Soifreturnorder(@Param("oid") Integer oid);
//    Boolean Soifreturn(@Param("oid") Integer oid);
//    Boolean Soifmoney(@Param("oid") Integer oid);

}

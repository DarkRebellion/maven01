package com.neuedu.service.impl;

import com.neuedu.bean.Ugorder;
import com.neuedu.dao.UgorderDAO;
import com.neuedu.dto.UgorderDTO;
import com.neuedu.service.UgorderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class UgorderServiceImpl implements UgorderService {

    @Autowired
    private UgorderDAO ugorderDAO;



    @Override
    public List<Ugorder> selectOne(Integer oid) {
        return ugorderDAO.selectOne(oid);
    }

    @Override
    public List<UgorderDTO> selectByCondition(String condition) {
        switch (condition){
            case "all":return  change(ugorderDAO.selectAll());
            case "delivery":return change(ugorderDAO.selectUnDelivery());
            case "success":return change(ugorderDAO.selectSuccess());
        }
        return null;
    }

    @Override
    public void pay(Integer oid){
        ugorderDAO.pay(oid,NOW());
    }

    @Override
    public void delivery(Integer oid){
        ugorderDAO.delivery(oid,NOW());
        if(true) {
            ugorderDAO.finish(oid, NOW());
        }
    }

    private Date  NOW(){
        Date currentDate = new Date(System.currentTimeMillis());
        return currentDate;
    }//获取当前时间

    private List<UgorderDTO> change( List<Ugorder> ugorders){
        List<UgorderDTO> lists=new ArrayList<>();
        for (Ugorder ugorder:ugorders) {
            UgorderDTO ugorderDTO=new UgorderDTO();
            BeanUtils.copyProperties(ugorder,ugorderDTO);
//            condition 处理
            ugorderDTO.setCondition(getConditionByoid(ugorderDTO.getOid()));
            lists.add(ugorderDTO);
        }
        return lists;
    }//dao与dto的转换 前台传dto

    private String getConditionByoid(Integer oid){
        Ugorder ugorder=ugorderDAO.selectOne(oid).get(0);
        if (ugorder.getOifreturnorder()) {
            if (ugorder.getOifpay()) {
                if (ugorder.getOifdelivery()) {
                    if (ugorder.getOiffinish()) {
                        if (ugorder.getOifreturnorder()) {
                            if (ugorder.getOifreturn()) {
                                if (ugorder.getOifmoney()) {
                                    return "未退款";
                                } else return "已退款";
                            } else return "已退货";
                        } else return "已完成";
                    } else return "未完成";
                } else return "尚未发货";
            } else return "尚未支付";
        }else return "订单取消";
//        return "未知";
    }
}



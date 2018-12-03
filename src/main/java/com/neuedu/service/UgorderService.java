package com.neuedu.service;

import com.neuedu.bean.Ugorder;
import com.neuedu.dto.UgorderDTO;

import java.util.List;

public interface UgorderService {
    List<Ugorder> selectOne(Integer oid);
    List<UgorderDTO> selectByCondition(String condition);
    void pay(Integer oid);
    void delivery(Integer oid);

}

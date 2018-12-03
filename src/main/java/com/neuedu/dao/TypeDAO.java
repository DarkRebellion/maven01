package com.neuedu.dao;

import com.neuedu.bean.TypeBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TypeDAO {
    List<TypeBean> getalltype();
    TypeBean select(@Param("tid") Integer tid);
}

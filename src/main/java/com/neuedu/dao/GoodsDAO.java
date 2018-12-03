package com.neuedu.dao;

import com.neuedu.bean.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsDAO  {
    int insert(@Param("goods") Goods goods);
    List<Goods> list();
    List<Goods> one(@Param("gid")Integer gid);
}

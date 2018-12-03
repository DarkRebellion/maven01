package com.neuedu.service;

import com.neuedu.bean.BuyCar;
import com.neuedu.bean.Goods;

import java.util.List;

public interface BuyService {
    List<Goods> goods();
    Goods goodsone(Integer gid);
    List<BuyCar> buycar(Integer uid);
    void insertcar(BuyCar buyCar);
    void deletecar(Integer cid);
    void updatecar(Integer cid,Integer num);
}

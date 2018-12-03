package com.neuedu.service.impl;

import com.neuedu.bean.BuyCar;
import com.neuedu.bean.Goods;
import com.neuedu.dao.BuyCarDAO;
import com.neuedu.dao.GoodsDAO;
import com.neuedu.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//页面
@Service
public class BuyServiceImpl implements BuyService {

    @Autowired
    private BuyCarDAO buyCarDAO;
    @Autowired
    private GoodsDAO goodsDAO;


    @Override
    public List<Goods> goods() {
        return goodsDAO.list();
    }

    @Override
    public Goods goodsone(Integer gid) {
        return goodsDAO.one(gid).get(0);
    }

    @Override
    public List<BuyCar> buycar(Integer uid) {
        return buyCarDAO.buycars(uid);
    }

    @Override
    public void insertcar(BuyCar buyCar) {
        buyCarDAO.insertcar(buyCar);
    }

    @Override
    public void deletecar(Integer cid) {
        buyCarDAO.deletecar(cid);

    }

    @Override
    public void updatecar(Integer cid,Integer num) {
        buyCarDAO.updatecar(cid,num);

    }
}

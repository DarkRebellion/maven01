package com.neuedu.service.impl;

import com.neuedu.bean.Goods;
import com.neuedu.bean.TypeBean;
import com.neuedu.dao.GoodsDAO;
import com.neuedu.dao.TypeDAO;
import com.neuedu.dto.GoodsResult;
import com.neuedu.service.GoodsService;
import com.neuedu.util.ImgUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDAO goodDAO;
    @Autowired
    private TypeDAO typeDAO;

    @Override
    public List<TypeBean> typeall() {
        return typeDAO.getalltype();
    }

    @Override
    public Goods  saveGoods(Goods goods, MultipartFile gphoto , String path) {
        String strphone=ImgUtil.insertPath(gphoto,path);
//        System.out.println("strphone"+strphone);
        goods.setGhoto(strphone);
        return goods;

    }

    @Override
    public void goodsadd(Goods goods) {
            goodDAO.insert(goods);

    }

    @Override
    public List<GoodsResult> selectall() {
        List<Goods> goods=goodDAO.list();
        List<GoodsResult> gR=new ArrayList<>();

        for (Goods good:goods){
            GoodsResult goodsResult=new GoodsResult();

            BeanUtils.copyProperties(good,goodsResult);
            goodsResult.setGphotopath(good.getGhoto());

            TypeBean typeBeans=typeDAO.select(good.getTid());
            goodsResult.setTname(typeBeans.getTname());
            gR.add(goodsResult);
       }
        return gR;
    }
}

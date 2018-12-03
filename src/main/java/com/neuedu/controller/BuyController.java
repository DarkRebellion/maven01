package com.neuedu.controller;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.neuedu.bean.BuyCar;
import com.neuedu.bean.Goods;
import com.neuedu.dto.BuyCarDTO;
import com.neuedu.service.impl.BuyServiceImpl;
import com.neuedu.service.impl.GoodsServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BuyController {

    @Autowired
    private BuyServiceImpl buyServiceImpl;
//    @Autowired
//    private GoodsServiceImpl goodsServiceImpl;


    @RequestMapping("buygoods")
    public String list(Model model) {
        List<Goods> goods = buyServiceImpl.goods();
        model.addAttribute(goods);
        return "buygoods";
    }
    @RequestMapping("buyone/{gid}/d")
    public String one(@PathVariable("gid")Integer gid, Model model) {
        Goods goods = buyServiceImpl.goodsone(gid);
        model.addAttribute(goods);
        return "buygoods";
    }
    @RequestMapping("inbuycar")
    public String inbuycar(BuyCar buyCar) {
        buyServiceImpl.insertcar(buyCar);
        return "buycar";
    }
    @RequestMapping("buycar/{uid}/d")
    public String buycar(@PathVariable("uid")Integer uid,Model model) {
        List<BuyCar> buyCar= buyServiceImpl.buycar(uid);
        List<BuyCarDTO> buyCarDTOList=new ArrayList<>();
        for(BuyCar buycar0:buyCar){
            Integer price=buyServiceImpl.goodsone(buycar0.getGid()).getGprice();
            BuyCarDTO buyCarDTO=new BuyCarDTO();
            BeanUtils.copyProperties(buycar0,buyCarDTO);
            buyCarDTO.setGprice(price);
            buyCarDTOList.add(buyCarDTO);
        }
//        BeanUtils.copyProperties(buyCar,buyCarDTOList);
//        for (BuyCarDTO buyCarDTO:buyCarDTOList) {
//            Goods goods=buyServiceImpl.goodsone(buyCarDTO.getGid());//查找单个商品
//            buyCarDTO.setGprice(goods.getGprice());
//        }
        model.addAttribute(buyCarDTOList);
        return "buycarin";
    }


}

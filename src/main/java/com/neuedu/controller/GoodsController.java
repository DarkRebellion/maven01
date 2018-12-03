package com.neuedu.controller;

import com.neuedu.bean.Goods;
import com.neuedu.bean.TypeBean;
import com.neuedu.dto.GoodsResult;
import com.neuedu.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @RequestMapping("list")
    public String all(Model model) {
        List<GoodsResult> list= goodsService.selectall();
//        System.out.println(list);
        model.addAttribute("goodslist",list);
        return "goodlist";
    }
    @RequestMapping(value = "add",method = RequestMethod.GET)
    public String find(Model model) {

        List<TypeBean> typeBeans=goodsService.typeall();
//        System.out.println(users);
        model.addAttribute("type",typeBeans);
        return "goodadd";
    }
    @RequestMapping("/addcommit")
    public String add(GoodsResult goodsResult , HttpServletRequest request){
//       处理文件
//        System.out.println("goodsResult="+goodsResult);


        Goods goods=new Goods(goodsResult);
        String path=request.getServletContext().getRealPath("/")+"/goods/upload/";
//        goods.setGhoto("处理");
        Goods good=goodsService.saveGoods(goods,goodsResult.getGphoto(),path);

        goodsService.goodsadd(good);
        return "redirect:/goods/list";
    }

}

package com.neuedu.service;



import com.neuedu.bean.Goods;
import com.neuedu.bean.TypeBean;
import com.neuedu.dto.GoodsResult;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface GoodsService {

    List<TypeBean> typeall();

    List<GoodsResult> selectall();

    void goodsadd(Goods goods);

    Goods  saveGoods(Goods goods,MultipartFile gphoto,String path);

}

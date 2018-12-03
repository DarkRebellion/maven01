package com.neuedu.dao;

import com.neuedu.bean.BuyCar;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BuyCarDAO {
    void insertcar(@Param("buycar") BuyCar buyCar);
    void deletecar(@Param("cid")Integer cid);
    void updatecar(@Param("cid")Integer cid,@Param("num")Integer num);
    List<BuyCar> buycars(@Param("uid")Integer uid);

}

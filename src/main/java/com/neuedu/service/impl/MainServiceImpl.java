package com.neuedu.service.impl;

import com.neuedu.bean.Authority;
import com.neuedu.bean.User;
import com.neuedu.dao.AuthorityDAO;
import com.neuedu.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MainServiceImpl implements MainService {

    @Autowired
    private AuthorityDAO authorityDAO;

    @Override
    public List<Authority> tomain(User user) {
        String raids = user.getRaids();
        //提取出来使用，分隔
        String raidss[] = raids.split(",");
        //把数组转化集合
        List<String> list = Arrays.asList(raidss);
//       进行查找
        List<Authority> mainDTO=authorityDAO.getauthority(list);
        return mainDTO;
    }
}

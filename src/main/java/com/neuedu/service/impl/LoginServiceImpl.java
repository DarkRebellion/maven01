package com.neuedu.service.impl;

import com.neuedu.bean.User;
import com.neuedu.dao.UserDAO;
import com.neuedu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User userlogin(String unum, String upwd) {
//        System.out.println("login:"+unum+upwd);
        User user=userDAO.loginBynamepassword(unum,upwd);
        
        return user;
    }
}

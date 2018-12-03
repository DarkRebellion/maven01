package com.neuedu.service.impl;

import com.neuedu.bean.User;
import com.neuedu.dao.UserDAO;
import com.neuedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Override
    public List<User> selectall() {
        return userDAO.selectAll();
    }

    @Override
    public List<User> selectbylv(Integer lv) {
        return userDAO.selectBylv(lv);
    }

    @Override
    public List<User> selectDelete() {
        return userDAO.selectDelete();
    }

    @Override
    public void deleteUser(String unum) {
        try {
            userDAO.deleteUser(unum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void redeleteUser(String unum) {
        try {
            userDAO.redeleteUser(unum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void trdeleteUser(String unum) {
        try {
            userDAO.tudeleteUser(unum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<User> selectByUnum(String unum) {
        List<User> users= userDAO.selectByUnum(unum);
        return users;
    }

    @Override
    public void updateUser(User user) {
        try {
            userDAO.updateUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void insertUser(User user,int lv,String raids) {
        try {
            System.out.println(user);
            user.setUauthority(lv);
            user.setRadders(raids);
            userDAO.insertUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void changeRaids(Integer lv,String unum) {
        String raids="";
        switch (lv){
            case 1:raids="1,4,5";break;
            case 2:raids="1,2,3,4,5";break;
            case 3:raids="1,2,3,4,5,6";break;
        }

        userDAO.changeraids(lv,raids,unum);
    }
}

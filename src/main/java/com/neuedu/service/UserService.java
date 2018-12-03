package com.neuedu.service;

import com.neuedu.bean.User;

import java.util.List;

public interface UserService {

    List<User> selectall();

    List<User> selectbylv(Integer lv);

    List<User> selectDelete();

    void deleteUser(String unum);

    void redeleteUser(String unum);

    void trdeleteUser(String unum);

    List<User> selectByUnum(String unum);

    void updateUser(User user);

    void insertUser(User user,int lv,String raids);

    void changeRaids(Integer lv,String unum);

}

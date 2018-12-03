package com.neuedu.dao;



import com.neuedu.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDAO {

//    List<User> selectauthoritylv(int lv);
//
//    int sumCount(int lv);
//
//    List<User> selectlimit(int lv, int offset, int num);

    List<User> selectByUnum(@Param("unum")String unum);

    List<User> selectAll();

    List<User> selectBylv(@Param("lv")Integer lv);

    List<User> selectDelete();

    int insertUser(@Param("user")User user);

    int insertVip(@Param("user")User user);

    void deleteUser(@Param("unum")String unum);

    void redeleteUser(@Param("unum")String unum);

    void tudeleteUser(@Param("unum")String unum);

    int updateUser(@Param("user")User user);

    void changeraids(@Param("uauthority")Integer uauthority,@Param("raids")String raids,@Param("unum")String unum);

    User loginBynamepassword(@Param("unum")String unum,@Param("upwd")String upwd);
}

package com.neuedu.dao;

import com.neuedu.bean.Authority;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuthorityDAO {
    List<Authority> getauthority(@Param("ids") List<String> ids);
}
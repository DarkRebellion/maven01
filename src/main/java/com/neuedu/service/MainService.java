package com.neuedu.service;

import com.neuedu.bean.Authority;
import com.neuedu.bean.User;

import java.util.List;

public interface MainService {
    List<Authority> tomain(User user);
}

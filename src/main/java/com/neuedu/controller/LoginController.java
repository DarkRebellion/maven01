package com.neuedu.controller;

import com.neuedu.bean.Authority;
import com.neuedu.bean.User;
import com.neuedu.service.LoginService;
import com.neuedu.service.UserService;
import com.neuedu.service.impl.MainServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @Autowired
    private LoginService loginService;
    @Autowired
    private MainServiceImpl mainServiceImpl;

//    @RequestMapping("main")
//    public String mian(Model model){
//        User user1=loginService.userlogin("13002271201","00000000");
//        if (user1.getRaids()!=null) {
//            List<Authority> authorities = mainServiceImpl.tomain(user1);
////            System.out.println(authorities);
//            model.addAttribute("main","13002271201");
//            model.addAttribute("authorities", authorities);
//            return "main";
//        }
//        else
//            return "login";
//    }
    @RequestMapping("login")
    public String index(){
        return "login";
    }

    @RequestMapping("welcome")
    public String welcome(){
        return "welcome";
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public String add(User useradd){
//        userService.insertUser(useradd,1);
        return "login";
    }
    @RequestMapping("reportform")
    public String reportform(){
        return "reportform";
    }

    @RequestMapping(value = "/main",method = RequestMethod.POST)
    public String main(User user,Model model){
        System.out.println(user);
        User user1=loginService.userlogin(user.getUnum(),user.getUpwd());
        System.out.println(user1);
        if (user1!=null){
            List<Authority> authorities=mainServiceImpl.tomain(user1);
            if (user1.getUname()!=null)
                model.addAttribute("main",user1.getUname());
            else
                model.addAttribute("main",user1.getUnum());
//            System.out.println(authorities);
            model.addAttribute("authorities",authorities);
            return "main";
        }
        return "login";
    }
}

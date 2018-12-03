package com.neuedu.controller;

import com.neuedu.bean.User;
import com.neuedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("list")
    public String all(Model model){
        List<User> users=userService.selectall();
//        System.out.println(users);
        model.addAttribute("userlist",users);
        return "userlist";
    }
    @RequestMapping("deletelist")
    public String alldelete(Model model){
        List<User> users=userService.selectDelete();
//        System.out.println(users);
        model.addAttribute("userlist",users);
        return "userdelete";
    }
//还原
    @RequestMapping(value = "redelete/{unum}/d",method = RequestMethod.GET)
    public String redelete(@PathVariable("unum") String unum){
        userService.redeleteUser(unum);
        return "redirect:/user/deletelist";
    }

//删掉
    @RequestMapping(value = "trdelete/{unum}/d",method = RequestMethod.GET)
    public String trdelete(@PathVariable("unum") String unum){
        userService.trdeleteUser(unum);
        return "redirect:/user/deletelist";
    }





    @RequestMapping("vip")
    public String vip(Model model){
        List<User> users=userService.selectbylv(2);
        model.addAttribute("viplist",users);
        return "viplist";
    }
    @RequestMapping("add")
    public String add(){
        return "vipadd";
    }



    @RequestMapping(value = "vip/addvip",method = RequestMethod.POST)
    public String addvip(User useradd){
        userService.insertUser(useradd,2,"1,2,3,4,5");
        return "redirect:/user/vip";
    }




    @RequestMapping(value = "delete/{unum}/d",method = RequestMethod.GET)
    public String userdelete(@PathVariable("unum") String unum){
        userService.deleteUser(unum);
        return "redirect:/user/list";
    }


    @RequestMapping(value = "find/{unum}/d",method = RequestMethod.GET)
    public String userupdate(@PathVariable("unum") String unum,Model model){
        List<User> users=userService.selectByUnum(unum);
        model.addAttribute("user",users);
        return "userupdate";
    }
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(User userup){
        userService.updateUser(userup);
        return "redirect:/user/list";
    }
}

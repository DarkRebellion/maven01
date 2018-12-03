package com.neuedu.controller;


import com.neuedu.bean.Ugorder;
import com.neuedu.bean.User;
import com.neuedu.dto.UgorderDTO;
import com.neuedu.service.UgorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("ugorder")
public class UgorderController {
    @Autowired
    private UgorderService ugorderService;

    @RequestMapping("list")
    public String all(Model model){
        List<UgorderDTO> ugorders=ugorderService.selectByCondition("all");
//        System.out.println(ugorders);
        model.addAttribute("ugorderslist",ugorders);
        return "ugorderslist";
    }

    @RequestMapping("undelivery")
    public String delivery(Model model){
        List<UgorderDTO> ugorders=ugorderService.selectByCondition("delivery");
//        System.out.println(ugorders);
        model.addAttribute("ugordersdelivery",ugorders);
        return "ugorderslist";
    }

    @RequestMapping("success")
    public String success(Model model){
        List<UgorderDTO> ugorders=ugorderService.selectByCondition("success");
//        System.out.println(ugorders);
        model.addAttribute("ugorderssuccess",ugorders);
        return "ugorderslist";
    }

    @RequestMapping(value = "find/{oid}/d",method = RequestMethod.GET)
    public String one(@PathVariable("oid") String oid, Model model){
        Integer oidnew=toInteger(oid);
        List<Ugorder> ugorders=ugorderService.selectOne(oidnew);
        model.addAttribute("ugordersone",ugorders);
        return "ugordersone";
    }

    @RequestMapping(value = "delivery/{oid}/d",method = RequestMethod.GET)
    public String delivery(@PathVariable("oid") String oid, Model model){
        Integer oidnew=toInteger(oid);
        ugorderService.delivery(oidnew);
        return "ugorderslist";
    }//发货


    Integer toInteger(String str){
        Integer integer;
        integer= Integer.valueOf(str);
        return integer;
    }
}

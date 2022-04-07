package com.wu.controller;

import com.wu.pojo.User;
import com.wu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.security.provider.MD5;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/insert")
    public String insertUser(User user, Model model){
        //md5加密
        String s1 = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
        user.setPassword(s1);

        int i = userService.insertUser(user);
        if (i>0){
            String s="插入成功";
            model.addAttribute("msg",s);
            System.out.println("插入成功");
        }else {
            String s="插入失败";
            model.addAttribute("msg",s);
            System.out.println("插入失败");
        }

        return "index";
    }
}

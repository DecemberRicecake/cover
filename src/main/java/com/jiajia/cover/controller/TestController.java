package com.jiajia.cover.controller;


import com.jiajia.cover.common.ServerResponse;
import com.jiajia.cover.entity.Product;
import com.jiajia.cover.entity.User;
import com.jiajia.cover.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
@RequestMapping("/user/")
public class TestController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("")
    public  String world(){
        return  "iii";
    }

    @RequestMapping(value = "getalluserinfo", method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse <List<User>> getalluserinfo(){
        return  ServerResponse.createBySuccess(iUserService.getAllUserInfo());
    }

    @RequestMapping(value = "getuserinfo", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse <User> getuserinfo(){
        return  ServerResponse.createBySuccess(iUserService.getUserInfo());
    }

}

package com.syd.diary.controller;

import com.syd.diary.entity.User;
import com.syd.diary.service.UserService;
import com.syd.diary.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author sunyaodong
 * @description
 * @email 15091776297@163.com
 * @created 2019/5/24 上午10:56
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
        @Autowired
        private UserService userService;

        @RequestMapping(value  =  "/addUser")
        public CommonResult addUser(User user){
            CommonResult result =new CommonResult();
            try {
                userService.addUser(user);
                return result;
            } catch (Exception e) {
                e.printStackTrace();
                result.setState(500);
                result.setMsg("失败");
                return result;
            }
        }
}

package com.jiutian.controller;

import com.jiutian.pojo.Ticket;
import com.jiutian.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: UserController
 * Package: com.jiutian.controller
 * Description:
 *
 * @Date: 2022/2/11 21:53
 * @Author: jiutian
 */
@RequestMapping("/user")
@RestController
public class UserController {

    private final UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @RequestMapping("/getTicket")
    public Ticket getTicket(){
        return userService.buyTicket();
    }
}

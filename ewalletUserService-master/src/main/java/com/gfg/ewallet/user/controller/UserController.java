package com.gfg.ewallet.user.controller;

import com.gfg.ewallet.user.domain.MyUser;
import com.gfg.ewallet.user.service.UserService;
import com.gfg.ewallet.user.service.request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public MyUser registerUser(@RequestBody UserRequest userRequest){
        return  userService.saveUser(userRequest.toUser());
    }

    @GetMapping("/profile")
    public MyUser getUser(@RequestParam Integer userId){

       return userService.getUser(userId);
    }



}

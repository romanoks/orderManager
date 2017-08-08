package com.order_manager.api;

import com.order_manager.models.User;
import com.order_manager.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, path = "/user/{uuid}")
    public User getUserByUuid(@PathVariable String uuid){
        return userService.getUserByUuid(uuid);
    }
}
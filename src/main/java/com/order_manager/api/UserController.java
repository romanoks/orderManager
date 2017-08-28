package com.order_manager.api;

import com.order_manager.models.User;
import com.order_manager.models.pagination.Pagination;
import com.order_manager.models.pagination.ResultWithPagination;
import com.order_manager.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, path = "/user/{uuid}")
    public User getUserByUuid(@PathVariable String uuid){
        return userService.getUserByUuid(uuid);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/user/all")
    public ResultWithPagination getAllUsers(Pagination paging){
        return userService.getAllUsers(paging);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/user")
    public String createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/user/{uuid}")
    public String deleteUserByUuid(@PathVariable String uuid){
        return userService.deleteUserByUuid(uuid);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/user/{uuid}")
    public String updateUserByUuid(@PathVariable String uuid, @RequestBody User user){
        return userService.updateUserByUuid(uuid, user);
    }
}
package com.order_manager.services;

import com.order_manager.mappers.UserMapper;
import com.order_manager.models.User;
import com.order_manager.models.pagination.Pagination;
import com.order_manager.models.pagination.ResultWithPagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserByUuid(String uuid) {
        return userMapper.getUserByUuid(uuid);
    }

    public ResultWithPagination getAllUsers(Pagination paging){
        ResultWithPagination result = new ResultWithPagination();
        result.setItems(userMapper.getAllUsers(paging));
        result.setFilter(paging.getFilter());
        result.setLimit(paging.getLimit());
        result.setPage(paging.getPage());
        result.setSort_field(paging.getSort_field());
        result.setSort(paging.getSort());
        result.setCount(userMapper.getCountRows(paging));
        return result;
    }

    public String createUser(User user){
        user.setUuid(UUID.randomUUID().toString());
        userMapper.createUser(user);
        return "Success!";
    }
    public String deleteUserByUuid(String uuid){
        userMapper.deleteUserByUuid(uuid);
        return "Success!";
    }
    public String updateUserByUuid(String uuid, User user){
        userMapper.updateUserByUuid(uuid, user);
        return user.getUuid();
    }

}
package com.order_manager.mappers;

import com.order_manager.models.User;
import com.order_manager.models.pagination.Pagination;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface UserMapper {
    User getUserByUuid(@Param("uuid") String uuid);
    List<User> getAllUsers(@Param("paging") Pagination paging);
    void createUser(@Param("user") User user);
    void deleteUserByUuid(@Param("uuid") String uuid);
    void updateUserByUuid(@Param("uuid") String uuid, @Param("user") User user);
    Integer getCountRows(@Param("paging") Pagination paging);
}
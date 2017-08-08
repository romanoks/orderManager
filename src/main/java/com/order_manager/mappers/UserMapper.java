package com.order_manager.mappers;

import com.order_manager.models.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper {
    User getUserByUuid(@Param("uuid") String uuid);
}
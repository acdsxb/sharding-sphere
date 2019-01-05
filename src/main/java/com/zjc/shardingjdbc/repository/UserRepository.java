package com.zjc.shardingjdbc.repository;

import com.zjc.shardingjdbc.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * create by zhaojinchao on 2018/12/18
 */
@Mapper
@Repository
public interface UserRepository {

    /**
     * 获取用户信息
     *
     * @param id
     * @return
     */
    User getUserById(@Param("id") Long id);
}

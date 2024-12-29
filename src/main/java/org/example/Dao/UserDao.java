package org.example.Dao;

import org.example.Dto.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserDao {
    // 모든 레코트 조회
    List<User> selectAll();

    // id로 레코트 조회
    List<User> selectById(@Param("id") int id);
}

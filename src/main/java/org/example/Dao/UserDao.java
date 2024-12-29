package org.example.Dao;

import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;

@Repository
public class UserDao {
    public String selectUser(@Param("userId") String userId) {
        return "SELECT * FROM USER WHERE USER_ID = #{userId}";
    }
}

package com.example.validation.mapper;


import com.example.validation.dto.UserAddDTO;
import org.apache.ibatis.annotations.*;

/**
 * @author SHUJINGPING
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user WHERE NAME = #{name}")
    UserAddDTO findByName(@Param("name") String name);

    @Insert("INSERT into user(name, age) values(#{name}, #{age})")
    void insert(@Param("name") String name, @Param("age") Integer age);

    @Update("UPDATE user set age=#{age} where name=#{name}")
    void updateByName(UserAddDTO userAddDTO);
}

package com.xml.mapper;

import com.xml.dataobject.UserDo;
import org.apache.ibatis.annotations.*;

import java.util.Collection;
import java.util.List;

@Mapper
public interface UserMapper {
//    @Select("SELECT * FROM user WHERE NAME=#{name}")
//    UserDo findByName(@Param("name") String name);

//    @Insert("INSERT INTO user(NAME, AGE) VALUES (#{name}, #{age}")
//    int insert(@Param("name") String name, @Param("age") Integer age);
    void insert(UserDo user);

    void updateById(UserDo user);

    void deleteById(@Param("id") Integer id);

    UserDo selectById(@Param("id") Integer id);

    UserDo selectByUsername(@Param("username") String username);

    List<UserDo> selectByIds(@Param("ids")Collection<Integer> ids);

}

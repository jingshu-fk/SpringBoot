package com.shu.mapper;


import com.shu.model.Stu;
import org.apache.ibatis.annotations.*;

@Mapper
public interface StuMapper {
    @Select("SELECT * FROM stu WHERE NAME = #{name}")
    Stu findByName(@Param("name") String name);

    @Insert("INSERT into stu(name, password, email) values(#{name}, #{password}, #{email})")
    void insert(@Param("name") String name, @Param("password") String password, @Param("email") String email);

    @Update("UPDATE stu set email=#{email} where name=#{name}")
    void updateByName(Stu stu);

    @Delete("DELETE FROM stu where name=#{name}")
    void deleteByName(@Param("name") String name);

}

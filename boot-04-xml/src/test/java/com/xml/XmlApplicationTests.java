package com.xml;

import com.xml.dataobject.UserDo;
import com.xml.mapper.UserMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@RunWith(SpringRunner.class)
@SpringBootTest
class XmlApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() {
        UserDo userDo = new UserDo();
        userDo.setUsername("阿慧");
        userDo.setPassword("nibucai");
        userDo.setCreateTime(new Date());
        userMapper.insert(userDo);
    }


    @Test
    public void testUpdateById() {
        UserDo updateUser = new UserDo();
        updateUser.setId(5);
        updateUser.setUsername("千代慧子");
        updateUser.setPassword("how are you");
        userMapper.updateById(updateUser);
    }

    @Test
    public void testDeleteById() {
        userMapper.deleteById(6);
    }

    @Test
    public void testSelectById() {
        UserDo u = userMapper.selectById(4);
        Assert.assertEquals("阿叔", u.getUsername());
    }

    @Test
    public void testSelectByUsername() {
        UserDo u = userMapper.selectByUsername("千代慧子");
        Assert.assertEquals("how are you", u.getPassword());
    }


    @Test
    public void testSelectByIds() {
        List<UserDo> users = userMapper.selectByIds(Arrays.asList(4, 5));
        System.out.println("users：" + users.size());
    }
}

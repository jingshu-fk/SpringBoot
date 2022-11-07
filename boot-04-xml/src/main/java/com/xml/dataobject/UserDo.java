package com.xml.dataobject;


import lombok.Data;
import java.util.Date;

@Data
public class UserDo {

    /**
     * 用户编号
     */
    private Integer id;

    /**
     * 账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 年龄
     */
    private Date createTime;
}


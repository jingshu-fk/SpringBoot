package com.test1.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Date;
@Data
@TableName("s_course")
public class Course {
    @TableId(type = IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("teacher_id")
    private Integer teacherId;

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    @TableField("course_date")
    private Date courseDate;

    @TableField("selected_num")
    private Integer selectedNum;

    @TableField("max_num")
    private Integer maxNum;

    @TableField("info")
    private String info;

}

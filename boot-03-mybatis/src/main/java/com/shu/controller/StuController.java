package com.shu.controller;


import com.shu.model.Stu;
import com.shu.mapper.StuMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stu")
public class StuController {

    /**
     *
     */
    @Autowired
    private StuMapper stuMapper;
    final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/query")
    public Stu getStu(@RequestParam(name = "name") String name){
        logger.info(stuMapper.findByName(name).toString());
        return stuMapper.findByName(name);
    }

    @PostMapping("/insert")
    public void insertStu(@RequestBody Stu stu){
        stuMapper.insert(stu.getName(), stu.getPassword(), stu.getEmail());
        logger.info(stu.getName() + "插入数据成功");
    }

}

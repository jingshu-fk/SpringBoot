package com.example.validation.controller;

import com.example.validation.dto.UserAddDTO;
import com.example.validation.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author SHUJINGPING
 */

@RestController
@RequestMapping("/users")
@Validated
public class UserController {
    @Autowired
    private UserMapper userMapper;

    private Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/get")
    public void get(@RequestParam("id") @Min(value = 1L, message = "编号必须大于 0") Integer id) {
        logger.info("[get][id: {}]", id);
    }

    @GetMapping("/query")
    public UserAddDTO getUsername(@RequestParam("name") @NotNull String name) {
        logger.info(userMapper.findByName(name).toString());
        return userMapper.findByName(name);
    }

    @PostMapping("/add")
    public void add(@Valid UserAddDTO addDTO) {
        userMapper.insert(addDTO.getName(), addDTO.getAge());
        logger.info("[add][addDTO: {}]", addDTO);
    }
}

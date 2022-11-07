package com.test1.service.impl;

import com.test1.dao.Course;
import com.test1.mapper.CourseMapper;
import com.test1.service.CourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    private static final Logger logger = LoggerFactory.getLogger(CourseServiceImpl.class);

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> getCourseById(List<Integer> ids) {
        List<Course> courses = courseMapper.selectBatchIds(ids);
        logger.info("查询课程成功");
        return courses;
    }

    @Override
    public int addCourse(Course course) {
        return courseMapper.insert(course);
    }
}

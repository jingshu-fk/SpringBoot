package com.test1.controller;

import com.test1.common.ErrorMessage;
import com.test1.dao.Course;
import com.test1.service.CourseService;
import com.test1.util.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/addCourse")
    public BaseResult addCourse(@RequestBody Course course) {
        try {
            int count = courseService.addCourse(course);
            if (count > 0) {
                return BaseResult.ok(count);
            } else {
                return BaseResult.error(ErrorMessage.UNKNOWN);
            }
        } catch (Exception e) {
            return BaseResult.error(ErrorMessage.UNKNOWN);
        }
    }

    @GetMapping("/course")
    public BaseResult getCourseById(@RequestParam(name = "ids") List<Integer> ids) {
        try {
            List<Course> courses = courseService.getCourseById(ids);
            if (courses != null) {
                return BaseResult.ok(courses);
            } else {
                return BaseResult.error();
            }
        } catch (Exception e) {
            return BaseResult.error(ErrorMessage.UNKNOWN);
        }
    }
}

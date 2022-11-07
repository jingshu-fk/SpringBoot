package com.test1.service;

import com.test1.dao.Course;


import java.util.List;

public interface CourseService {
    List<Course> getCourseById(List<Integer> ids);

    int addCourse(Course course);
}

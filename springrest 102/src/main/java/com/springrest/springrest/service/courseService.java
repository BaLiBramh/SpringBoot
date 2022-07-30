package com.springrest.springrest.service;

import com.springrest.springrest.model.course;

import java.util.List;
import java.util.Optional;

public interface courseService {
    public List<course>  getCourse();
    public Optional<course> getCourse(Long courseId);
    public course addCourse(course course);
    public course updateCourse(course course);
}

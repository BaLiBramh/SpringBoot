package com.springrest.springrest.service;

import com.springrest.springrest.jpaRepo.CourseDao;
import com.springrest.springrest.model.course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class courseServiceImp implements courseService{

    @Autowired
    private CourseDao courseDao;


    public Optional<course> getCourse(Long courseId){


        return courseDao.findById(courseId);

    }
    public course updateCourse(course course){
        courseDao.save(course);
        return course;

    }


    public course addCourse(course t){
        courseDao.save(t);
         return t;

    }

    public List<course> getCourse(){
        return  courseDao.findAll();
    }



}

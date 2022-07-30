package com.springrest.springrest.controller;

import com.springrest.springrest.model.course;
import com.springrest.springrest.service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {


    @Autowired
    private courseService courseService;


    @GetMapping("/course")
    public List<course> getCourse(){
      return this.courseService.getCourse();
    }

    @GetMapping("/course/{courseId}")
    public course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId)).orElseThrow(()->new RuntimeException(String.format("here is error %s ",courseId)));
    }

    @PostMapping("/addCourse")
    public course addCourse(@RequestBody  course course){
        return this.courseService.addCourse(course);
    }
    @PostMapping("/updateCourse")
    public course updateCourse(@RequestBody course course){
        return this.courseService.updateCourse(course);

    }


}

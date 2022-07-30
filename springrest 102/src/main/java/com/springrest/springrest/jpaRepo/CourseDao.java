package com.springrest.springrest.jpaRepo;

import com.springrest.springrest.model.course;
import org.springframework.data.jpa.repository.JpaRepository;




public interface CourseDao extends JpaRepository<course,Long> {

}

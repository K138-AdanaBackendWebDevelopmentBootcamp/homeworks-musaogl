package dev.patika.final_project.servics;
import dev.patika.final_project.repository.courseRepository;
import dev.patika.final_project.models.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class CourseServicelmpl {
   final courseRepository courseRepository;


   @Transactional(readOnly = true)
    public List<Course> findAll() {
        List<Course> courses=new ArrayList<>();
        Iterable<Course> courseIterable =courseRepository.findAll();
        courseIterable.iterator().forEachRemaining(courses::add);
        return courses;
    }
    @Transactional
    public Course save(Course course) {
        return courseRepository.save(course);
    }

    @Transactional(readOnly = true)
    public Course findById(int id) {
        return courseRepository.findById(id).get();
    }

    @Transactional
    public Course uptdate(Course course) {
        return courseRepository.save(course);
    }

    public void deleteById(int id) {
       courseRepository.deleteById(id);
    }
}


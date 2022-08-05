package dev.patika.final_project.controller;

import dev.patika.final_project.models.Course;
import dev.patika.final_project.servics.CourseServicelmpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class CourseController {

   private final CourseServicelmpl courseService;

    @GetMapping("/course")
    public ResponseEntity<List<Course>> getAllCourse(){
        return new ResponseEntity<> ( courseService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/course/{id}")
    public Course getCourseById(@PathVariable int id)
    {
        return courseService.findById(id);
    }
   @PostMapping("/course")
  public ResponseEntity<Course> saveCourse(@RequestBody Course course){
      return new ResponseEntity<>((Course)courseService.save(course), HttpStatus.OK);
  }
    @PutMapping("/course")
    public ResponseEntity<Course> uptdateCourse(@RequestBody Course course) {
        return new ResponseEntity<>((Course) courseService.uptdate(course), HttpStatus.OK);
    }
    @DeleteMapping ("/course/{id}")
    public String deleteCourse(@RequestBody int id) {
        courseService.deleteById(id);
        return "Deleted...";
    }


}

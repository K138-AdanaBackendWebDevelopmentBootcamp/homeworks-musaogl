package dev.patika.final_project.controller;

import dev.patika.final_project.models.Course;
import dev.patika.final_project.models.Student;
import dev.patika.final_project.servics.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class StudentController {
   private final StudentServiceImpl studentService;

        @GetMapping("/student")
        public ResponseEntity<List<Student>> getAllStudent(){
           return new ResponseEntity<List<Student>>( studentService.findAll(), HttpStatus.OK);
        }
     @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id)
    {
        return studentService.findById(id);
    }
    @PostMapping("/student")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        return new ResponseEntity<>((Student) studentService.save(student), HttpStatus.OK);
    }

    @PutMapping("/student")
    public ResponseEntity<Student> uptdateStudent(@RequestBody Student student) {
        return new ResponseEntity<>((Student) studentService.uptdate(student), HttpStatus.OK);
    }
    @DeleteMapping ("/student/{id}")
    public String deleteStudent(@RequestBody int id) {
        studentService.deleteById(id);
        return "Deleted...";
    }
}

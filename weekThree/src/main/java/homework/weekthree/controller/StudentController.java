package homework.weekthree.controller;

import homework.weekthree.model.Student;
import homework.weekthree.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class StudentController {
    StudentService studentService;

        @GetMapping("/student")
        public ResponseEntity<List<Student>> getAllStudent(){
           return new ResponseEntity<List<Student>>( studentService.findAll(), HttpStatus.OK);
        }
    @PostMapping("/student")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        return new ResponseEntity<>((Student) studentService.save(student), HttpStatus.OK);
    }
}

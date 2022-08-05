package dev.patika.final_project.controller;

import dev.patika.final_project.models.permanentInstructor;
import dev.patika.final_project.servics.permanentInstructorServicelmpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class permanentInstructorController {
   private final  permanentInstructorServicelmpl permanentInstructorService;

    @GetMapping("/permanentInstructor")
    public ResponseEntity<List<permanentInstructor>> getAllpermanentInstructor(){
        return new ResponseEntity<> ( permanentInstructorService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/permanentInstructor/{id}")
    public permanentInstructor getpermanentInstructorById(@PathVariable int id)
    {
        return permanentInstructorService.findById(id);
    }
    @PostMapping("/permanentInstructor")
    public ResponseEntity<permanentInstructor> savepermanentInstructor(@RequestBody permanentInstructor permanentInstructor){
        return new ResponseEntity<>((permanentInstructor)permanentInstructorService.save(permanentInstructor), HttpStatus.OK);
    }
    @PutMapping("/permanentInstructor")
    public ResponseEntity<permanentInstructor> uptdatepermanentInstructor(@RequestBody permanentInstructor permanentInstructor) {
        return new ResponseEntity<>((permanentInstructor) permanentInstructorService.uptdate(permanentInstructor), HttpStatus.OK);
    }

    @DeleteMapping ("/permanentInstructor/{id}")
    public String deletepermanentInstructor(@RequestBody int id) {
        permanentInstructorService.deleteById(id);
        return "Deleted...";
    }
}

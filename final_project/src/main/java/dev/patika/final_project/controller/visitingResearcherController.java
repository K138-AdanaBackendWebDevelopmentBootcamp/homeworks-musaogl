package dev.patika.final_project.controller;

import dev.patika.final_project.models.visitingResearcher;
import dev.patika.final_project.servics.visitingResearcherServicelmpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class visitingResearcherController {

    private final visitingResearcherServicelmpl visitingResearcherService;

    @GetMapping("/visitingResearcher")
    public ResponseEntity<List<visitingResearcher>> getAllCourse(){
        return new ResponseEntity<> ( visitingResearcherService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/visitingResearcher/{id}")
    public visitingResearcher getvisitingResearcherById(@PathVariable int id)
    {
        return visitingResearcherService.findById(id);
    }
    @PostMapping("/visitingResearcher")
    public ResponseEntity<visitingResearcher> savevisitingResearcher(@RequestBody visitingResearcher visitingResearcher){
        return new ResponseEntity<>((visitingResearcher)visitingResearcherService.save(visitingResearcher), HttpStatus.OK);
    }
    @PutMapping("/visitingResearcher")
    public ResponseEntity<visitingResearcher> uptdatevisitingResearcher(@RequestBody visitingResearcher visitingResearcher) {
        return new ResponseEntity<>((visitingResearcher) visitingResearcherService.uptdate(visitingResearcher), HttpStatus.OK);
    }
    @DeleteMapping ("/visitingResearcher/{id}")
    public String deletevisitingResearcher(@RequestBody int id) {
        visitingResearcherService.deleteById(id);
        return "Deleted...";
    }
}

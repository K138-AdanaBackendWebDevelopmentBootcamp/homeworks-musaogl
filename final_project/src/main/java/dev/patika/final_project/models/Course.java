package dev.patika.final_project.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@NoArgsConstructor
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   private String courseName;
   private int courseCode ;
   private int creditScore;

   @ManyToMany
   private List<Student> studentList=new ArrayList<>();

   @ManyToOne
   private instructor Instructor;

    public Course(String courseName, int courseCode, int creditScore) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditScore = creditScore;
    }
}

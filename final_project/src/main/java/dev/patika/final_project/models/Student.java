package dev.patika.final_project.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String name;
    private String adders;
    private String gender;
    private LocalDate birthDate;
    @ManyToMany
    private List<Course> courseList = new ArrayList<>();

    public Student(String name, String adders, String gender, LocalDate birthDate) {
        this.name = name;
        this.adders = adders;
        this.gender = gender;
        this.birthDate = birthDate;
    }
}

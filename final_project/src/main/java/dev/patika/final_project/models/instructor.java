package dev.patika.final_project.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@NoArgsConstructor
public class instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String adders;
    private int phoneNumber;
    @JsonBackReference
    @OneToMany(mappedBy = "instructor",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Course> courseList =new ArrayList<>();

    public instructor(String name, String adders, int phoneNumber) {
        this.name = name;
        this.adders = adders;
        this.phoneNumber = phoneNumber;
    }
}

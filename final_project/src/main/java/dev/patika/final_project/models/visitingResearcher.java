package dev.patika.final_project.models;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class visitingResearcher extends instructor {

    private double hourlySalary;

    public visitingResearcher(String name, String adders, int phoneNumber, double hourlySalary) {
        super(name, adders, phoneNumber);
        this.hourlySalary = hourlySalary;
    }
}

package dev.patika.final_project.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class permanentInstructor extends instructor {

    private double fixedSalary;

    public permanentInstructor(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public permanentInstructor(String name, String adders, int phoneNumber, double fixedSalary) {
        super(name, adders, phoneNumber);
        this.fixedSalary = fixedSalary;
    }
}

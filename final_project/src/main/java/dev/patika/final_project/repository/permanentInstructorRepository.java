package dev.patika.final_project.repository;

import dev.patika.final_project.models.permanentInstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface permanentInstructorRepository extends JpaRepository<permanentInstructor, Integer> {
}

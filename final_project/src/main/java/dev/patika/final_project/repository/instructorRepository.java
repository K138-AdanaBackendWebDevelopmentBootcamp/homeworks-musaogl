package dev.patika.final_project.repository;

import dev.patika.final_project.models.instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface instructorRepository extends JpaRepository<instructor, Integer> {

}

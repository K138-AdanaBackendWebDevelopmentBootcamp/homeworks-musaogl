package dev.patika.final_project.repository;

import dev.patika.final_project.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courseRepository extends JpaRepository<Course, Integer> {
}

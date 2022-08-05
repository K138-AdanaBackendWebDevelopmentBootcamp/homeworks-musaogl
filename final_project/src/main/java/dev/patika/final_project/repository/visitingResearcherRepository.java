package dev.patika.final_project.repository;

import dev.patika.final_project.models.visitingResearcher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface visitingResearcherRepository extends JpaRepository<visitingResearcher, Integer> {
}

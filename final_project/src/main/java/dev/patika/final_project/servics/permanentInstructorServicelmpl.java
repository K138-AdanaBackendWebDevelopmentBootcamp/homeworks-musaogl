package dev.patika.final_project.servics;

import dev.patika.final_project.models.permanentInstructor;
import dev.patika.final_project.repository.permanentInstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class permanentInstructorServicelmpl{
    final permanentInstructorRepository permanentInstructorRepository;

    @Transactional(readOnly = true)
    public List<permanentInstructor> findAll() {
        List<permanentInstructor> permanentInstructor=new ArrayList<>();
        Iterable<permanentInstructor> permanentInstructorIterable =permanentInstructorRepository.findAll();
        permanentInstructorIterable.iterator().forEachRemaining(permanentInstructor::add);
        return permanentInstructor;
    }
    @Transactional
    public permanentInstructor save(permanentInstructor permanentInstructor) {
        return permanentInstructorRepository.save(permanentInstructor);
    }

    @Transactional(readOnly = true)
    public permanentInstructor findById(int id) {
        return permanentInstructorRepository.findById(id).get();
    }

    @Transactional
    public permanentInstructor uptdate(permanentInstructor permanentInstructor) {
        return permanentInstructorRepository.save(permanentInstructor);
    }

    public void deleteById(int id) {
        permanentInstructorRepository.deleteById(id);
    }
}


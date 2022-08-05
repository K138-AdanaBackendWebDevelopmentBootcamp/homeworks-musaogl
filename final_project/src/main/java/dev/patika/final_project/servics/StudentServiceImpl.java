package dev.patika.final_project.servics;

import dev.patika.final_project.models.Student;
import dev.patika.final_project.repository.studentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class StudentServiceImpl{

    final studentRepository studentRepository;


    @Transactional(readOnly = true)
    public List<Student> findAll() {
        List<Student> student=new ArrayList<>();
        Iterable<Student> courseIterable =studentRepository.findAll();
        courseIterable.iterator().forEachRemaining(student::add);
        return student;
    }
    @Transactional
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Transactional(readOnly = true)
    public Student findById(int id) {
        return studentRepository.findById(id).get();
    }

    @Transactional
    public Student uptdate(Student student) {
        return studentRepository.save(student);
    }

    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }
}

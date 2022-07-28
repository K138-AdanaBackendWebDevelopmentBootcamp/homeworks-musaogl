package homework.weekthree.service;

import homework.weekthree.model.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService<Student> extends BaseService<Student> {
    homework.weekthree.model.Student save(homework.weekthree.model.Student student);
}

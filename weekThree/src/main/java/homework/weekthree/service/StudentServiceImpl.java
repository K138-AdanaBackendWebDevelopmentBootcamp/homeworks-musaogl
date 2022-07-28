package homework.weekthree.service;

import homework.weekthree.dao.StudentDao;
import homework.weekthree.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService<Student> {

     StudentDao<Student> studentDao;

    public StudentServiceImpl(StudentDao<Student> studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public Student save(Student student) {
        return (Student) studentDao.save(student);
    }

    @Override
    public void deleteFromDatabaseById(int id) {

    }

    @Override
    public Student updateOnDatabase(Student object) {
        return null;
    }

}

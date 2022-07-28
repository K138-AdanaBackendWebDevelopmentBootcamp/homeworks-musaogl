package homework.weekthree.dao;

import homework.weekthree.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class StudentDaoImpl implements BaseDao<Student> {

    EntityManager entityManager;

    public StudentDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Student> findAll() {
        return entityManager.createQuery("from Student",Student.class).getResultList();
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public Student save(Student student) {

        return entityManager.merge(student);
    }

    @Override
    public void deleteFromDatabaseById(int id) {

    }

    @Override
    public Student updateOnDatabase(Student object) {
        return null;
    }
}

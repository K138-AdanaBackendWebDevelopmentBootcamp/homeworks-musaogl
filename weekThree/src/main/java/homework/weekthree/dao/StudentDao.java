package homework.weekthree.dao;

import homework.weekthree.service.BaseService;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao<Student> extends BaseService<Student> {
}

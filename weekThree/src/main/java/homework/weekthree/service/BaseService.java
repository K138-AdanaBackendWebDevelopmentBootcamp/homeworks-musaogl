package homework.weekthree.service;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BaseService <T>  {
       // EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");
        List<T> findAll();
        T findById(int id);
        T save(T object);
       void deleteFromDatabaseById(int id);
        T updateOnDatabase(T object);
}

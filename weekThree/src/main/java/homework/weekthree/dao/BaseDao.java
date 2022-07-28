package homework.weekthree.dao;

import java.util.List;

public interface BaseDao<T>  {
       // EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");
        List<T> findAll();
        T findById(int id);
        T save(T object);
       void deleteFromDatabaseById(int id);
        T updateOnDatabase(T object);
}

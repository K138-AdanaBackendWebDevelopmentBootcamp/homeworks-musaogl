package clients;

import Controller.StudentController;
import Utils.EntityManagerUtils;
import models.*;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import static repository.Crudrepository.em;

public class testClient {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        if(checkData() == 0){saveTestData();}
    }
    private static int checkData() {
        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");
        return em.createQuery("FROM Student", Student.class).getResultList().size();
    }
    private static void saveTestData() {
        instructor teacher = new permanentInstructor("Mehmet","istanbul",539811052,2500.80);
        instructor teacher1 = new visitingResearcher("Meral","Ankara",5863479,206);
        instructor teacher2 = new permanentInstructor("Mariya","izmir",534879,20900);
        instructor teacher3 = new permanentInstructor("Fatih","Erzurum",5972211,4000.5);

        Student student1=new Student("Selim","istanbul","Erkek", LocalDate.of(1997,2,4));
        Student student2=new Student("Anas","izmir","Erkek", LocalDate.of(1999,2,8));
        Student student3=new Student("joudi","istanbul","Kız", LocalDate.of(2000,3,30));
        Student student4=new Student("Tahani","Ankara","Kız", LocalDate.of(1997,9,24));

        Course course=new Course("Tarih",021,4);
        Course course1=new Course("Fizik",022,5);
        Course course2=new Course("Kimya",024,5);
        Course course3=new Course("Matematik",025,4);

        try {
            em.getTransaction().begin();
            // ...
            em.persist(course1);
            em.persist(course2);
            em.persist(course3);
            em.persist(course);

            em.persist(teacher);
            em.persist(teacher1);
            em.persist(teacher2);
            em.persist(teacher3);

            em.persist(student1);
            em.persist(student2);
            em.persist(student3);
            em.persist(student4);

            System.out.println("All data are persisted");

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }
    }
}

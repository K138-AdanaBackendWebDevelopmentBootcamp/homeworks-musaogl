package dev.patika.final_project.Utlils;
import dev.patika.final_project.repository.*;
import dev.patika.final_project.models.*;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class initializerRunner implements CommandLineRunner {
    private static final Logger logger= LoggerFactory.getLogger(initializerRunner.class);
    private final courseRepository courseRepository;
    private final studentRepository studentRepository;
    private final instructorRepository instructorRepository;

    private final permanentInstructorRepository permanentInstructorRepository;
    private final visitingResearcherRepository visitingResearcherRepository;


    @Override
    @Transactional
    public void run(String... args) throws Exception {
        courseRepository.deleteAll();
        studentRepository.deleteAll();
        instructorRepository.deleteAll();
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


        courseRepository.save(course1);
        courseRepository.save(course2);
        courseRepository.save(course3);
        courseRepository.save(course);

        instructorRepository.save(teacher);
        instructorRepository.save(teacher1);
        instructorRepository.save(teacher2);
        instructorRepository.save(teacher3);

       studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);
        studentRepository.save(student4);

        logger.info("All Test Date saved ...");


    }
}

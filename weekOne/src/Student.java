import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String adders;
    private String gender;
    private double birthDate;
    private List<Course> courseList = new ArrayList<>();

    public Student(String name, String adders, String gender, double birthDate) {
        this.name = name;
        this.adders = adders;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdders() {
        return adders;
    }

    public void setAdders(String adders) {
        this.adders = adders;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(double birthDate) {
        this.birthDate = birthDate;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", adders='" + adders + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }


}

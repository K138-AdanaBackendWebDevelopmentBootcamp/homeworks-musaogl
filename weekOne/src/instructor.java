import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class instructor {
    private String name;
    private String adders;
    private int phoneNumber;
    private List<Course> courseList =new ArrayList<>();

    public instructor(String name, String adders, int phoneNumber) {
        this.name = name;
        this.adders = adders;
        this.phoneNumber = phoneNumber;
    }

    public instructor() {
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "instructor{" +
                "name='" + name + '\'' +
                ", adders='" + adders + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        instructor that = (instructor) o;
        return phoneNumber == that.phoneNumber && Objects.equals(name, that.name) && Objects.equals(adders, that.adders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, adders, phoneNumber);
    }

}

public class visitingResearcher extends instructor{
    private double hourlySalary;

    public visitingResearcher(String name, String adders, int phoneNumber, double hourlySalary) {
        super(name, adders, phoneNumber);
        this.hourlySalary = hourlySalary;
    }

    public visitingResearcher(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }
}

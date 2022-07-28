public class permanentInstructor extends instructor {
    private double fixedSalary;

    public permanentInstructor(String name, String adders, int phoneNumber, double fixedSalary) {
        super(name, adders, phoneNumber);
        this.fixedSalary = fixedSalary;
    }

    public permanentInstructor(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
}

public class FullTimeEmployee extends Employee {
    private double benefits;
    private String department;

    FullTimeEmployee(int employeeId, String name, double baseSalary, double benefits) {
        super(employeeId, name, baseSalary);
        this.benefits = benefits;
    }

    public double getBenefits() {
        return benefits;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + benefits;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Benefits: " + benefits);
        System.out.println("Total Salary: " + calculateSalary());
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
    
}

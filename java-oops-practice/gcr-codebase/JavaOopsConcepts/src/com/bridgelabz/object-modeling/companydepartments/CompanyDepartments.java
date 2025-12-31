package companydepartments;
import java.util.*;
public class CompanyDepartments {
    public static void main(String[] args) {

        Company tcs = new Company("TCS");

        tcs.addDepartment("IT");
        tcs.addDepartment("HR");

        tcs.departments.get(0).addEmployee("Ram");
        tcs.departments.get(0).addEmployee("Shyam");

        tcs.departments.get(1).addEmployee("Amit");

        tcs.showCompanyDetails();

        tcs = null;
        System.out.println("Company deleted");
    }
}

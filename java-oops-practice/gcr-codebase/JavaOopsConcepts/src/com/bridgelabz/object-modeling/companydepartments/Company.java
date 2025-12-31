package companydepartments;
import java.util.*;
public class Company {
        String companyName;
        List<Department> departments;

        Company(String companyName) {
            this.companyName = companyName;
            this.departments = new ArrayList<>();
        }

        void addDepartment(String deptName) {
            departments.add(new Department(deptName));
        }

        void showCompanyDetails() {
            System.out.println("Company: " + companyName);
            for (Department d : departments) {
                d.showDepartmentDetails();
            }
        }
}

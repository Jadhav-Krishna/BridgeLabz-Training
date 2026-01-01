public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee(1, "Alice", 50000, 10000);
        fte.assignDepartment("Engineering");
        fte.displayDetails();
        System.out.println("Department: " + fte.getDepartmentDetails());

        System.out.println();

        PartTimeEmployee pte = new PartTimeEmployee(2, "Bob", 20000, 50, 120);
        pte.assignDepartment("Marketing");
        pte.displayDetails();
        System.out.println("Department: " + pte.getDepartmentDetails());
    }
}

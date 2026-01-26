package streams;
import java.io.*;

public class Serialization {
	static class Employee implements Serializable {
		private static final long serialVersionUID = 1L;
		int id;
		String name;
		String department;
		double salary;

		public Employee(int id, String name, String department, double salary) {
			this.id = id;
			this.name = name;
			this.department = department;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
		}
	}

	public static void main(String[] args) {
		String filePath = "employees.ser";

		Employee emp1 = new Employee(1, "Harsh", "HR", 50000);
		Employee emp2 = new Employee(2, "Riya", "IT", 60000);
		Employee emp3 = new Employee(3, "Anuj", "Finance", 55000);

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
			oos.writeObject(new Employee[] { emp1, emp2, emp3 });
			System.out.println("Employees serialized to " + filePath);
		} catch (IOException e) {
			System.out.println("Error during serialization: " + e.getMessage());
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
			Employee[] employees = (Employee[]) ois.readObject();
			System.out.println("Deserialized Employees:");
			for (Employee emp : employees) {
				System.out.println(emp);
			}
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error during deserialization: " + e.getMessage());
		}

	}

}

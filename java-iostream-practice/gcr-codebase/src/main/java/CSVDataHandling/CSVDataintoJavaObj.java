package CSVDataHandling;
import java.io.*;
import java.util.*;

public class CSVDataintoJavaObj {
	public static class Student {
		private int id;
		private String name;
		private String department;
		private double salary;
		
		public Student(int id, String name, String department, double salary) {
			this.id = id;
			this.name = name;
			this.department = department;
			this.salary = salary;
		}
		
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
		}
	}

	public static void main(String[] args) {
		 String filePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\data.csv";
		 String line = "";
		 String splitBy = ",";
		 List<Student> students = new ArrayList<>();
		 
		 try {
			 BufferedReader br = new BufferedReader(new FileReader(filePath));

			 if ((line = br.readLine()) != null) {
				 // read and skip
			 }
			 
			 while ((line = br.readLine()) != null) {
				 String[] data = line.split(splitBy);
				 int id = Integer.parseInt(data[0]);
				 String name = data[1];
				 String department = data[2];
				 double salary = Double.parseDouble(data[3]);
				 
				 Student student = new Student(id, name, department, salary);
				 students.add(student);
			 }
			 br.close();
			 
			 for (Student s : students) {
				 System.out.println(s);
			 }
		 } catch (IOException e) {
			 e.printStackTrace();
		 }

	}

}

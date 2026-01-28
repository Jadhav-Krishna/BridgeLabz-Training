package CSVDataHandling;
import java.io.*;

public class ModifyUpdateCSV {

	public static void main(String[] args) {
		 String inputFilePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\data.csv";
		 String outputFilePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\updated_data.csv";
		 String line = "";
		 String splitBy = ",";
		 
		 try {
			 BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
			 BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath));
			 
			 if ((line = br.readLine()) != null) {
				 bw.write(line);
				 bw.newLine();
			 }
			 
			 while ((line = br.readLine()) != null) {
				 String[] employee = line.split(splitBy);
				 String department = employee[2];
				 double salary = Double.parseDouble(employee[3]);
				 
				 if (department.equalsIgnoreCase("IT")) {
					 salary *= 1.10;
					 employee[3] = String.format("%.2f", salary);
				 }
				 
				 bw.write(String.join(",", employee));
				 bw.newLine();
			 }
			 
			 br.close();
			 bw.close();
			 System.out.println("CSV file updated successfully.");
		 } catch (IOException e) {
			 e.printStackTrace();
		 }

	}

}

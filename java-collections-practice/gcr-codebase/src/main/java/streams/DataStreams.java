package streams;
import java.io.*;

public class DataStreams {

	public static void main(String[] args) {
		String filePath = "students.dat";

		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
			dos.writeInt(1);
			dos.writeUTF("Harsh");
			dos.writeDouble(3.8);

			dos.writeInt(2);
			dos.writeUTF("Ram");
			dos.writeDouble(3.5);

			dos.writeInt(3);
			dos.writeUTF("Anuj");
			dos.writeDouble(3.9);

			System.out.println("Student details: " + filePath);
		} catch (IOException e) {
			System.err.println("Error writing to file: " + e.getMessage());
		}

		try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
			while (dis.available() > 0) {
				int rollNumber = dis.readInt();
				String name = dis.readUTF();
				double gpa = dis.readDouble();

				System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
			}
		} catch (IOException e) {
			System.err.println("Error reading from file: " + e.getMessage());
		}

	}
}

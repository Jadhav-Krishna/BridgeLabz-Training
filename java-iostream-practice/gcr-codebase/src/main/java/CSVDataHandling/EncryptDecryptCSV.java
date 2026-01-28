package CSVDataHandling;
import java.util.*;
import java.io.*;

public class EncryptDecryptCSV {

	public static void main(String[] args) {
		String filePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\data.csv";
		String encryptedFilePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\encrypted_data.csv";
		String decryptedFilePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\decrypted_data.csv";

		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			BufferedWriter bw = new BufferedWriter(new FileWriter(encryptedFilePath));
			String line;

			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				values[2] = Base64.getEncoder().encodeToString(values[2].getBytes());
				values[3] = Base64.getEncoder().encodeToString(values[3].getBytes());
				bw.write(String.join(",", values));
				bw.newLine();
			}
			br.close();
			bw.close();

			BufferedReader brDecrypt = new BufferedReader(new FileReader(encryptedFilePath));
			BufferedWriter bwDecrypt = new BufferedWriter(new FileWriter(decryptedFilePath));

			while ((line = brDecrypt.readLine()) != null) {
				String[] values = line.split(",");
				values[2] = new String(Base64.getDecoder().decode(values[2]));
				values[3] = new String(Base64.getDecoder().decode(values[3]));
				bwDecrypt.write(String.join(",", values));
				bwDecrypt.newLine();
			}
			brDecrypt.close();
			bwDecrypt.close();

			System.out.println("Encryption and Decryption");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

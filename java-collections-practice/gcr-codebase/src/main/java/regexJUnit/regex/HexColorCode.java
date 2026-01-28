package regexJUnit.regex;

public class HexColorCode {
	public static boolean isValidHexColor(String color) {
		String regex = "^#([A-Fa-f0-9]{6})$";
		return color.matches(regex);
	}

	public static void main(String[] args) {
		
		String[] testColors = { "#FFA500", "#ff4500", "#123", "#GHIJKL", "#abcdef", "#1234567" };

		for (String color : testColors) {
			System.out.println(color + " → " + (isValidHexColor(color) ? "Valid" : "Invalid"));
		}
	}
}

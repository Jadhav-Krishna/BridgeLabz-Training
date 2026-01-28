package regexJUnit.regex;

public class ValidateIPAddress {

	public static void main(String[] args) {
		String[] testIPs = {""};
		String ipv4Pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
		for (String ip : testIPs) {
			if (ip.matches(ipv4Pattern)) {
				System.out.println(ip + " is a valid IPv4 address.");
			} else {
				System.out.println(ip + " is not a valid IPv4 address.");
			}
		}
	}
}
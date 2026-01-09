package org.scenario.Artify;

public class ArtifyApp {

	public static void main(String[] args) {
		Artwork printArt = new PrintArtwork("Sunset Print", "Artist A", 1200, "PRINT");
		Artwork digitalArt = new DigitalArt("Modern Digital", "Artist B", 200, "NFT");
		User user = new User("Shna", 1500);

		System.out.println("wallet balance: " + user.getWalletBalance());

		double balanceAfterDigital = digitalArt.purchase(user);
		System.out.println("After, wallet balance: " + balanceAfterDigital);
		System.out.println("Digital art license: " + digitalArt.license(user));

		double balanceAfterPrint = printArt.purchase(user);
		System.out.println("Before, wallet balance: " + balanceAfterPrint);
		System.out.println("Printable art license: " + printArt.license(user));
	}

}

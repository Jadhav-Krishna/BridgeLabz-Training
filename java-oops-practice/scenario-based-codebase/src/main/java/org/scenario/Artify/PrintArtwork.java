package org.scenario.Artify;

public class PrintArtwork extends Artwork{
	PrintArtwork(String title, String artist, double price, String licenseType) {
		super(title, artist, price, licenseType);
	}
	
	@Override
	public double purchase(User user) {
		boolean success = user.deductFromWallet(getPrice());
		return user.getWalletBalance();
	}
	
	@Override
	public String license(User user) {
		return "PRINT-LICENSE-" + getTitle().toUpperCase() + "-" + user.getName().toUpperCase();
	}
}

package org.scenario.Artify;

public class DigitalArt extends Artwork{

	DigitalArt(String title, String artist, double price, String licenseType) {
		super(title, artist, price, licenseType);
	}

	@Override
	public double purchase(User user) {
		boolean success = user.deductFromWallet(getPrice());
		return user.getWalletBalance();
	}
	
	@Override
	public String license(User user) {
		return "DIGITAL-NFT-" + getTitle().toUpperCase() + "-" + user.getName().toUpperCase();
	}
}

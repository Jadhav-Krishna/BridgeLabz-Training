package org.scenario.Artify;

public abstract class Artwork implements IPurchase{
	private String title;
	private String artist;
	private double price;
	private String licenseType;

	Artwork(String title, String artist, double price, String licenseType){
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.licenseType = licenseType;
	}

	public String getTitle() {
		return this.title;
	}

	public String getArtist() {
		return this.artist;
	}
	
	public double getPrice() {
		return this.price;
	}

	protected String getLicenseType() {
		return this.licenseType;
	}

	@Override
	public abstract double purchase(User user);

	@Override
	public abstract String license(User user);
}

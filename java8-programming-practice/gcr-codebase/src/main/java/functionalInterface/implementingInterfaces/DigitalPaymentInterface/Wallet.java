package functionalInterface.implementingInterfaces.DigitalPaymentInterface;

public class Wallet implements DigitalPayment{
	@Override
	public void pay() {
		System.out.println("Paying Using Wallet");
	}
}
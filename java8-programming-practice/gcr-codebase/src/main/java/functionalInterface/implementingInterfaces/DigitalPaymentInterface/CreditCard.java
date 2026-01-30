package functionalInterface.implementingInterfaces.DigitalPaymentInterface;

public class CreditCard implements DigitalPayment{
	@Override
	public void pay() {
		System.out.println("Paying Using Credit Card");
	}
}

package functionalInterface.implementingInterfaces.DigitalPaymentInterface;

public class UPI implements DigitalPayment{
	@Override
	public void pay() {
		System.out.println("Paying Using UPI");
	}
}

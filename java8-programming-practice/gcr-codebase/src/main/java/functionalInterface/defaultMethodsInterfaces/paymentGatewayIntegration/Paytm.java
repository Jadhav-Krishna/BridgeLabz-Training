package functionalInterface.defaultMethodsInterfaces.paymentGatewayIntegration;

public class Paytm implements PaymentProcessor{

	@Override
	public void pay(double amount) {
		System.out.println("payment done with Paytm : " + amount);
	}

}

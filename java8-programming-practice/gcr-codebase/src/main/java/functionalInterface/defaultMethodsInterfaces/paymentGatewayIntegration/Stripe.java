package functionalInterface.defaultMethodsInterfaces.paymentGatewayIntegration;

public class Stripe implements PaymentProcessor{

	@Override
	public void pay(double amount) {
		System.out.println("Paying using Stripe : "+amount);
	}

	public void refund(double amount) {
		System.out.println("refunded amount : "+amount);
	}
}

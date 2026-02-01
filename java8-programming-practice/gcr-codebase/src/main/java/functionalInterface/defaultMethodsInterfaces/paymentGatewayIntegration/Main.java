package functionalInterface.defaultMethodsInterfaces.paymentGatewayIntegration;

public class Main {

	public static void main(String[] args) {
		PaymentProcessor p = new Paytm();
		p.refund(500);
		
		Paytm pt = new Paytm();
		pt.pay(250.7);
		pt.refund(200);
		
		Stripe s = new Stripe();
		s.pay(7000);
		s.refund(2500);

	}

}

package lambdaExpressions;

public class InvoiceObjectCreation {
    static class Invoice {
        String transactionID;

        Invoice(String transactionID) {
            this.transactionID = transactionID;
        }

        @Override
        public String toString() {
            return "Invoice{" + "transactionID='" + transactionID + '\'' + '}';
        }
    }

    public static void main(String[] args) {
        String[] transactionIDs = {"TXN1001", "TXN1002", "TXN1003"};

        System.out.println("Generated Invoices:");
        java.util.Arrays.stream(transactionIDs).map(Invoice::new).forEach(System.out::println);
    }
}

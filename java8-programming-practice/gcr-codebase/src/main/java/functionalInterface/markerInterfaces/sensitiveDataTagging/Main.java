package functionalInterface.markerInterfaces.sensitiveDataTagging;

public class Main {

    public static void main(String[] args) {

        EncryptionService service = new EncryptionService();

        service.process(new User());
        service.process(new Product());
    }
}

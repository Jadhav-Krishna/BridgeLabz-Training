package functionalInterface.markerInterfaces.sensitiveDataTagging;

class EncryptionService {

    void process(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data...");
        } else {
            System.out.println("No encryption required");
        }
    }
}

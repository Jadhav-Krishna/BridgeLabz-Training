package functionalInterface.markerInterfaces.dataSerializationBackup;

public class Main {

    public static void main(String[] args) {

        BackupService service = new BackupService();

        service.processBackup(new User());
        service.processBackup(new TempSession());
    }
}


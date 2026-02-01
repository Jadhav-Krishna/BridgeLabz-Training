package functionalInterface.markerInterfaces.dataSerializationBackup;

public class BackupService {
	
	void processBackup(Object obj) {
        if (obj instanceof BackupAble) {
            System.out.println("Backing up object...");
        } else {
            System.out.println("Backup not allowed for this object");
        }
	}

}

package org.scenario.HospitalQueue;

public class HospitalQueue {

    public static void main(String[] args) {

        Patient[] patients = new Patient[6];

        patients[0] = new Patient("Rahul", 30, 4);
        patients[1] = new Patient("Amit", 45, 9);
        patients[2] = new Patient("Neha", 25, 2);
        patients[3] = new Patient("Sonal", 35, 7);
        patients[4] = new Patient("Muskan", 25, 3);
        patients[5] = new Patient("Harsh", 35, 8);

        int n = patients.length;

        for (int i = 0; i < n-1; i++) {
//        	boolean isSwap = false;
            for (int j = 0; j < n-i-1; j++) {
                if (patients[j].criticality < patients[j + 1].criticality) {
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
//                    isSwap = true;
                }
            }
//            if(!isSwap) {
//            	return;
//            }
        }

        for (Patient p : patients) {
            System.out.println(p.name + " -> " + p.criticality);
        }
    }
}

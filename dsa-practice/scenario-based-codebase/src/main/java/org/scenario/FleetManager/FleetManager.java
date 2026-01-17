package org.scenario.FleetManager;

public class FleetManager {
	public static void main(String[] args) {
		Vehicle[] vehicle = {
				new Vehicle("Hero Honda", 85),
				new Vehicle("pulsar", 35),
				new Vehicle("Duke", 25),
				new Vehicle("Shine", 70),
				new Vehicle("Platina", 110)
		};
        mergeSort(vehicle, 0, vehicle.length - 1);
        for (Vehicle s : vehicle) {
            System.out.println(s.name + " -> " + s.milage);
        }
	}
	
	static void mergeSort(Vehicle[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(Vehicle[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Vehicle[] L = new Vehicle[n1];
        Vehicle[] R = new Vehicle[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i].milage <= R[j].milage) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}
	

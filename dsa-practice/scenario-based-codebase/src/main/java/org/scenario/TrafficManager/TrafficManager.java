package org.scenario.TrafficManager;

import java.util.*;

class TrafficManager {

    Vehicle head = null;
    Queue<String> waitingQueue = new LinkedList<>();
    int capacity = 5;
    int size = 0;
    
    void arrive(String number) {
        waitingQueue.add(number);
    }

    void enterRoundabout() {
        if (size == capacity) {
            System.out.println("Roundabout FULL");
            return;
        }
        if (waitingQueue.isEmpty()) {
            System.out.println("No vehicle waiting");
            return;
        }
        Vehicle newCar = new Vehicle(waitingQueue.poll());
        if (head == null) {
            head = newCar;
            newCar.next = head;
        } else {
            Vehicle temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newCar;
            newCar.next = head;
        }
        size++;
    }

    void exitRoundabout() {
        if (head == null) {
            System.out.println("Roundabout EMPTY");
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            Vehicle temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
        }
        size--;
    }

    void showRoundabout() {
        if (head == null) {
            System.out.println("Roundabout EMPTY");
            return;
        }
        Vehicle temp = head;
        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to " + head.number + ")");
    }
}

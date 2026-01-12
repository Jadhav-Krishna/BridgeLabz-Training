package org.scenario.CallCenter;

import java.util.*;

class CallCenter {

    Queue<Customer> normalQueue = new LinkedList<>();
    PriorityQueue<Customer> vipQueue =
            new PriorityQueue<>((a, b) -> 0);
    HashMap<String, Integer> callCount = new HashMap<>();

    // Incoming call
    void receiveCall(Customer c) {
        if (c.isVIP) {
            vipQueue.add(c);
        } else {
            normalQueue.add(c);
        }
        callCount.put(c.id, callCount.getOrDefault(c.id, 0) + 1);
    }

    // Serve call
    void serveCall() {
        Customer c;

        if (!vipQueue.isEmpty()) {
            c = vipQueue.poll();
        } else {
            c = normalQueue.poll();
        }

        if (c != null) {
            System.out.println("Serving customer: " + c.id);
        }
    }
}

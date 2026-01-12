package org.scenario.AmbulanceRoute;

class AmbulanceRoute {

    Unit head;

    // Add unit in circular list
    void addUnit(String name, boolean available) {
        Unit newUnit = new Unit(name, available);

        if (head == null) {
            head = newUnit;
            newUnit.next = head;
            return;
        }

        Unit temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newUnit;
        newUnit.next = head;
    }

    // Find nearest available unit
    void sendPatient() {
        if (head == null) return;

        Unit temp = head;

        do {
            if (temp.available) {
                System.out.println("Patient sent to: " + temp.name);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("No unit available");
    }

    // Remove unit
    void removeUnit(String name) {
        if (head == null) return;

        Unit curr = head;
        Unit prev = null;

        do {
            if (curr.name.equals(name)) {

                if (curr == head) {
                    Unit last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // Display route
    void showUnits() {
        if (head == null) return;

        Unit temp = head;
        do {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to " + head.name + ")");
    }
}


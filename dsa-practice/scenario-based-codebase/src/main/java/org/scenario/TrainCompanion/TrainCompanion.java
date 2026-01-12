package org.scenario.TrainCompanion;

class TrainCompanion {

    Compartment head;
    Compartment current;

    // Add compartment at end
    void addCompartment(String name) {
        Compartment newComp = new Compartment(name);
        if (head == null) {
            head = newComp;
            current = newComp;
            return;
        }
        Compartment temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newComp;
        newComp.prev = temp;
    }

    // Move forward
    void moveNext() {
        if (current.next != null) {
            current = current.next;
            System.out.println("Now at: " + current.name);
        }
    }

    // Move backward
    void movePrev() {
        if (current.prev != null) {
            current = current.prev;
            System.out.println("Now at: " + current.name);
        }
    }

    // Remove compartment
    void removeCompartment(String name) {
        Compartment temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) {
                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;
                if (temp.next != null)
                    temp.next.prev = temp.prev;
                if (current == temp)
                    current = head;
                return;
            }
            temp = temp.next;
        }
    }

    void showAdjacent() {
        if (current.prev != null)
            System.out.println("Previous: " + current.prev.name);
        System.out.println("Current: " + current.name);
        if (current.next != null)
            System.out.println("Next: " + current.next.name);
    }
}

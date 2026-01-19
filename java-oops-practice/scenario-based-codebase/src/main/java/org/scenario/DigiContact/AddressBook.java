package org.scenario.DigiContact;

import java.util.*;

class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();

    void addContact(Contact c) {
        for (Contact contact : contacts) {
            if (contact.getFullName().equalsIgnoreCase(c.getFullName())) {
                System.out.println("Duplicate contact not allowed");
                return;
            }
        }
        contacts.add(c);
    }

    void editContact(String name, String newPhone, String newEmail) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(name)) {
                c.setPhone(newPhone);
                c.setEmail(newEmail);
                return;
            }
        }
        System.out.println("Contact not found");
    }

    void deleteContact(String name) {
        contacts.removeIf(c -> c.getFullName().equalsIgnoreCase(name));
    }

    void searchByLocation(String value) {
        for (Contact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(value) || c.getAddress().getState().equalsIgnoreCase(value)) {
                c.display();
            }
        }
    }

    void displayAll() {
        contacts.sort(Comparator.comparing(Contact::getFullName));
        for (Contact c : contacts) {
            c.display();
        }
    }
}

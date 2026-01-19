package org.scenario.DigiContact;

public class Main {
    public static void main(String[] args) {

        AddressBook book = new AddressBook();

        book.addContact(new Contact("Aman", "Sharma","9999999999", "aman@gmail.com",new Address("Pune", "Maharashtra", "411001")));

        book.addContact(new Contact("Neha", "Verma","8888888888", "neha@gmail.com",new Address("Mumbai", "Maharashtra", "400001")));

        book.displayAll();

        book.searchByLocation("Pune");

        book.editContact("Aman Sharma", "7777777777", "aman_new@gmail.com");

        book.deleteContact("Neha Verma");

        book.displayAll();
    }
}

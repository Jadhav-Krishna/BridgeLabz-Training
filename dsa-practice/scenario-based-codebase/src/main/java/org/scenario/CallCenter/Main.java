package org.scenario.CallCenter;

public class Main {
    public static void main(String[] args) {

        CallCenter center = new CallCenter();

        center.receiveCall(new Customer("C101", false));
        center.receiveCall(new Customer("C102", true));
        center.receiveCall(new Customer("C101", false));

        center.serveCall(); 
        center.serveCall();  
    }
}

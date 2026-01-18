package org.scenario.PayXpress;

public class Main {
    public static void main(String[] args) {
        IPayable bill1 = new ElectricityBill(1200, "15-Sept");
        IPayable bill2 = new InternetBill(999, "18-Sept");
        IPayable bill3 = new WaterBill(400, "20-Sept");
        bill1.sendReminder();
        bill2.sendReminder();
        bill3.sendReminder();
        bill1.pay();
        bill2.pay();
    }
}

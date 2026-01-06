package org.scenario.EventEase;

import java.util.List;

public abstract class Event implements ISchedulable {
    private static int nextId = 1;

    private final int eventId;
    private String eventName;
    private String location;
    private String date;
    private int attendees;
    private User organizer;
    private boolean cateringIncluded;
    private boolean decorationIncluded;
    private double baseVenueCost;
    private double cateringCost;
    private double decorationCost;
    private double discount;
    private double totalCost;

    public Event(String eventName, String location, String date, int attendees, User organizer) {
        this(eventName, location, date, attendees, organizer, false, false);
    }

    public Event(String eventName, String location, String date, int attendees, User organizer,
                 boolean cateringIncluded, boolean decorationIncluded) {
        this.eventId = nextId++;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.cateringIncluded = cateringIncluded;
        this.decorationIncluded = decorationIncluded;
        this.baseVenueCost = 0;
        this.cateringCost = 0;
        this.decorationCost = 0;
        this.discount = 0;
        this.totalCost = 0;
    }

    public int getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public int getAttendees() {
        return attendees;
    }

    public User getOrganizer() {
        return organizer;
    }

    public boolean isCateringIncluded() {
        return cateringIncluded;
    }

    public boolean isDecorationIncluded() {
        return decorationIncluded;
    }

    public double getTotalCost() {
        return totalCost;
    }

    protected void setBaseVenueCost(double baseVenueCost) {
        this.baseVenueCost = baseVenueCost;
        calculateTotalCost();
    }

    protected void setCateringCost(double cateringCost) {
        this.cateringCost = cateringCost;
        calculateTotalCost();
    }

    protected void setDecorationCost(double decorationCost) {
        this.decorationCost = decorationCost;
        calculateTotalCost();
    }

    protected void setDiscount(double discount) {
        this.discount = discount;
        calculateTotalCost();
    }

    private void calculateTotalCost() {
        double services = cateringCost + decorationCost;
        double total = baseVenueCost + services - discount;
        if (total < 0) {
            total = 0;
        }
        this.totalCost = total;
    }

    public void showSummary() {
        System.out.println("Event ID: " + eventId);
        System.out.println("Name: " + eventName);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Attendees: " + attendees);
        System.out.println("Organizer: " + organizer.getName());
        System.out.println("Catering: " + (cateringIncluded ? "Yes" : "No"));
        System.out.println("Decoration: " + (decorationIncluded ? "Yes" : "No"));
        System.out.println("Total Cost: " + totalCost);
        System.out.println();
    }
}


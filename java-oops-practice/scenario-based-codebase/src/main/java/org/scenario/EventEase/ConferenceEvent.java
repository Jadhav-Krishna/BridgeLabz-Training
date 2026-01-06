package org.scenario.EventEase;

public class ConferenceEvent extends Event {
    public ConferenceEvent(String eventName, String location, String date, int attendees, User organizer,
                           boolean cateringIncluded, boolean decorationIncluded) {
        super(eventName, location, date, attendees, organizer, cateringIncluded, decorationIncluded);
        setBaseVenueCost(20000);
        if (cateringIncluded) {
            setCateringCost(attendees * 800);
        }
        if (decorationIncluded) {
            setDecorationCost(10000);
        }
        setDiscount(2000);
    }

    public ConferenceEvent(String eventName, String location, String date, int attendees, User organizer) {
        this(eventName, location, date, attendees, organizer, false, false);
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled on " + getDate() + " at " + getLocation());
    }

    @Override
    public void reschedule(String newDate) {
        System.out.println("Rescheduling conference from " + getDate() + " to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Conference cancelled for " + getDate());
    }
}

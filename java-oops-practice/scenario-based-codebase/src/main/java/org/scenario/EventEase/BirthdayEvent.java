package org.scenario.EventEase;

public class BirthdayEvent extends Event {
    public BirthdayEvent(String eventName, String location, String date, int attendees, User organizer,
                         boolean cateringIncluded, boolean decorationIncluded) {
        super(eventName, location, date, attendees, organizer, cateringIncluded, decorationIncluded);
        setBaseVenueCost(5000);
        if (cateringIncluded) {
            setCateringCost(attendees * 300);
        }
        if (decorationIncluded) {
            setDecorationCost(2000);
        }
        setDiscount(500);
    }

    public BirthdayEvent(String eventName, String location, String date, int attendees, User organizer) {
        this(eventName, location, date, attendees, organizer, false, false);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday event scheduled on " + getDate() + " at " + getLocation());
    }

    @Override
    public void reschedule(String newDate) {
        System.out.println("Rescheduling birthday event from " + getDate() + " to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday event cancelled for " + getDate());
    }
}


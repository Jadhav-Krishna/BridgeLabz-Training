package org.scenario.EventEase;

public class EventEaseApp {
    public static void main(String[] args) {
        User organizer = new User("Riya Sharma", "riya@example.com", "9876543210");

        BirthdayEvent birthday = new BirthdayEvent(
                "Rohan's 18th Birthday",
                "Green Garden Banquet",
                "2026-02-10",
                50,
                organizer,
                true,
                true
        );

        ConferenceEvent conference = new ConferenceEvent(
                "Tech Innovators Conference",
                "City Convention Center",
                "2026-03-15",
                200,
                organizer,
                true,
                false
        );

        System.out.println("Initial event summaries:");
        birthday.showSummary();
        conference.showSummary();

        System.out.println("Scheduling events:");
        birthday.schedule();
        conference.schedule();

        System.out.println("\nRescheduling birthday event:");
        birthday.reschedule("2026-02-12");

        System.out.println("\nCancelling conference:");
        conference.cancel();

        System.out.println("\nFinal event summaries:");
        birthday.showSummary();
        conference.showSummary();
    }
}


package org.scenario.EventEase;

public interface ISchedulable {

    void cancel();
    void reschedule(String newDate);
    void schedule();
}

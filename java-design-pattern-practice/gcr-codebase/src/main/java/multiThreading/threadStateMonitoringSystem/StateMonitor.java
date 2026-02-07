package multiThreading.threadStateMonitoringSystem;

import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class StateMonitor extends Thread {
    private final Thread[] targets;
    private final Map<String, Set<Thread.State>> history = new LinkedHashMap<>();

    public StateMonitor(Thread[] targets) {
        super("Monitor");
        this.targets = targets;
        for (Thread t : targets) {
            history.put(t.getName(), new LinkedHashSet<>());
        }
    }

    @Override
    public void run() {
        boolean allTerminated = false;
        while (!allTerminated) {
            allTerminated = true;
            for (Thread t : targets) {
                Thread.State state = t.getState();
                history.get(t.getName()).add(state);
                System.out.println("[Monitor] " + t.getName() + " is in " + state + " state at " + LocalTime.now());
                if (state != Thread.State.TERMINATED) {
                    allTerminated = false;
                }
            }
            sleepMillis(500);
        }
        for (Map.Entry<String, Set<Thread.State>> entry : history.entrySet()) {
            System.out.println("Summary: " + entry.getKey() + " went through " + entry.getValue().size() + " states");
        }
    }

    private void sleepMillis(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

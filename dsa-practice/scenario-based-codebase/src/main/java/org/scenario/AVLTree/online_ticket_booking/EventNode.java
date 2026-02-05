package org.scenario.AVLTree.online_ticket_booking;

public class EventNode
{
    public int eventTime;
    public String eventName;
    public EventNode left;
    public EventNode right;

    public EventNode(int eventTime, String eventName)
    {
        this.eventTime = eventTime;
        this.eventName = eventName;
    }
}

package org.scenario.AVLTree.online_ticket_booking;

public class EventBST
{
    public EventNode rootNode;

    // Insert Event
    public EventNode addEvent(EventNode node, int eventTime, String eventName)
    {
        if (node == null)
            return new EventNode(eventTime, eventName);

        if (eventTime < node.eventTime)
            node.left = addEvent(node.left, eventTime, eventName);
        else
            node.right = addEvent(node.right, eventTime, eventName);

        return node;
    }

    // Find minimum
    public EventNode minNode(EventNode node)
    {
        while (node.left != null)
            node = node.left;
        return node;
    }

    // Cancel Event
    public EventNode removeEvent(EventNode node, int eventTime)
    {
        if (node == null)
            return null;

        if (eventTime < node.eventTime)
            node.left = removeEvent(node.left, eventTime);
        else if (eventTime > node.eventTime)
            node.right = removeEvent(node.right, eventTime);
        else
        {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            EventNode nextNode = minNode(node.right);
            node.eventTime = nextNode.eventTime;
            node.eventName = nextNode.eventName;
            node.right = removeEvent(node.right, nextNode.eventTime);
        }
        return node;
    }

    // Display in upcoming order
    public void printUpcoming(EventNode node)
    {
        if (node != null)
        {
            printUpcoming(node.left);
            System.out.println(node.eventTime + " -> " + node.eventName);
            printUpcoming(node.right);
        }
    }
}


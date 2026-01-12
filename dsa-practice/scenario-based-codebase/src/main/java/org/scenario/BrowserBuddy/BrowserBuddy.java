package org.scenario.BrowserBuddy;

import java.util.Stack;

class BrowserBuddy {

    Page current;
    Stack<Page> closedTabs = new Stack<>();

    // Visit new page
    void visit(String url) {
        Page newPage = new Page(url);

        if (current != null) {
            current.next = newPage;
            newPage.prev = current;
        }

        current = newPage;
        System.out.println("Visited: " + url);
    }

    // Back operation
    void back() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Back to: " + current.url);
        }
    }

    // Forward operation
    void forward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Forward to: " + current.url);
        }
    }

    // Close current tab
    void closeTab() {
        if (current != null) {
            closedTabs.push(current);
            System.out.println("Tab closed: " + current.url);
            current = current.prev;
        }
    }

    // Restore closed tab
    void restoreTab() {
        if (!closedTabs.isEmpty()) {
            current = closedTabs.pop();
            System.out.println("Restored tab: " + current.url);
        }
    }
}

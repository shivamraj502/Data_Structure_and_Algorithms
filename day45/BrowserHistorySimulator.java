/**
Day 45 – Mini-Project #6
Task: Build a Browser History Simulator using Stack + Queue.
“Back”, “Forward”, “Visit new page”.
Goal: Combine both data structures practically.
 */

import java.util.Stack;
public class BrowserHistorySimulator {

    Stack<String> backStack = new Stack<>();
    Stack<String> forwardStack = new Stack<>();
    String currentPage = "https://www.google.com";   // starting page

    // Visit a new page
    public void visit(String url) {
        backStack.push(currentPage);     // Save current page to back
        forwardStack.clear();            // Clear forward history
        currentPage = url;               // Go to new page
        System.out.println("Visited: " + url);
    }

    // Go Back
    public void back() {
        if (backStack.isEmpty()) {
            System.out.println("Cannot go back! Already at starting page.");
            return;
        }
        forwardStack.push(currentPage);        // Save current to forward
        currentPage = backStack.pop();         // Go to previous page
        System.out.println("Back to: " + currentPage);
    }

    // Go Forward
    public void forward() {
        if (forwardStack.isEmpty()) {
            System.out.println("Cannot go forward! No forward history.");
            return;
        }
        backStack.push(currentPage);           // Save current to back
        currentPage = forwardStack.pop();      // Go to next page
        System.out.println("Forward to: " + currentPage);
    }

    // Show current page
    public void showCurrent() {
        System.out.println("Current Page: " + currentPage);
    }

    // Main Method - Testing the Browser
    public static void main(String[] args) {
        BrowserHistorySimulator browser = new BrowserHistorySimulator();

        browser.showCurrent();

        browser.visit("https://www.youtube.com");
        browser.visit("https://www.github.com");
        browser.visit("https://www.leetcode.com");

        browser.back();
        browser.back();

        browser.forward();

        browser.visit("https://www.chatgpt.com");

        browser.back();
        browser.forward();
        browser.back();
    }
}

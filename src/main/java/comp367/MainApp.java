package comp367;

import java.time.LocalTime;

public class MainApp {
    public static void main(String[] args) {

        // Morning simulation
        simulateGreeting(9);   // 9 AM
        System.out.println("------------------------");

        // Afternoon simulation
        simulateGreeting(15);  // 3 PM
    }

    public static void simulateGreeting(int hour) {
        if (hour < 12) {
            System.out.println("Good morning, Samreet, Welcome to COMP367");
        } else {
            System.out.println("Good afternoon, Samreet, Welcome to COMP367");
        }
    }
}

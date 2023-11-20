package com.example.military_taskten;

// Main.java
public class Main {
    public static void main(String[] args) {
        CivilService civilService = new CivilService();
        MilitaryService militaryService = new MilitaryService(100);

        // Call methods or perform actions as needed
        System.out.println("Days left in Civil Service: " + civilService.getDaysLeft());
        System.out.println("Days left in Military Service: " + militaryService.getDaysLeft());

        // Perform additional operations...
    }
}

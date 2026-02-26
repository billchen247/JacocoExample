package com.training.example.JacocoExample;

import java.time.LocalTime;
import java.util.logging.Logger;

public class App {
    
    private static final Logger logger = Logger.getLogger(App.class.getName());
    
    public static void main(String[] args) {
        displayGreeting(LocalTime.now());
    }

    public static void displayGreeting(LocalTime time) {
        int hour = time.getHour();
        String greeting = getGreeting(hour);
        
        logger.info(greeting);
        logger.info("Hello World!");
    }
    
    public static String getGreeting(int hour) {
        if (hour >= 5 && hour < 12) {
            return "Good morning!";
        } else if (hour >= 12 && hour < 17) {
            return "Good afternoon!";
        } else {
            return "Good evening!";
        }
    }
}

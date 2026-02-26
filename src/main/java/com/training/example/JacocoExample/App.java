package com.training.example.JacocoExample;

import java.time.LocalTime;

public class App {
    
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();
        
        String greeting;
        
        if (hour >= 5 && hour < 12) {
            greeting = "Good morning!";
        } else if (hour >= 12 && hour < 17) {
            greeting = "Good afternoon!";
        } else {
            greeting = "Good evening!";
        }
        
        System.out.println(greeting);
        System.out.println("Hello World!");
    }
}

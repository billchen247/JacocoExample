package com.training.example.jacocoexample;

import org.junit.Test;

import com.training.example.jacocoexample.App;

import java.time.LocalTime;
import static org.junit.Assert.*;

public class AppTest {
    
    @Test
    public void testGetGreeting_EarlyMorning() {
        // Test hours 5-11 should return "Good morning!"
        assertEquals("Good morning!", App.getGreeting(5));
        assertEquals("Good morning!", App.getGreeting(8));
        assertEquals("Good morning!", App.getGreeting(11));
    }
    
    @Test
    public void testGetGreeting_Afternoon() {
        // Test hours 12-16 should return "Good afternoon!"
        assertEquals("Good afternoon!", App.getGreeting(12));
        assertEquals("Good afternoon!", App.getGreeting(14));
        assertEquals("Good afternoon!", App.getGreeting(16));
    }
    
    @Test
    public void testGetGreeting_Evening() {
        // Test hours 17-23 and 0-4 should return "Good evening!"
        assertEquals("Good evening!", App.getGreeting(17));
        assertEquals("Good evening!", App.getGreeting(20));
        assertEquals("Good evening!", App.getGreeting(23));
        assertEquals("Good evening!", App.getGreeting(0));
        assertEquals("Good evening!", App.getGreeting(2));
        assertEquals("Good evening!", App.getGreeting(4));
    }
    
    @Test
    public void testGetGreeting_BoundaryValues() {
        // Test boundary conditions
        assertEquals("Good evening!", App.getGreeting(4));  // Last hour of evening
        assertEquals("Good morning!", App.getGreeting(5));  // First hour of morning
        assertEquals("Good morning!", App.getGreeting(11)); // Last hour of morning
        assertEquals("Good afternoon!", App.getGreeting(12)); // First hour of afternoon
        assertEquals("Good afternoon!", App.getGreeting(16)); // Last hour of afternoon
        assertEquals("Good evening!", App.getGreeting(17)); // First hour of evening
    }
    
    @Test
    public void testDisplayGreeting_Morning() {
        // Test displayGreeting with morning time
        LocalTime morningTime = LocalTime.of(9, 30);
        App.displayGreeting(morningTime);
        // Method should execute without exceptions
    }
    
    @Test
    public void testDisplayGreeting_Afternoon() {
        // Test displayGreeting with afternoon time
        LocalTime afternoonTime = LocalTime.of(14, 45);
        App.displayGreeting(afternoonTime);
        // Method should execute without exceptions
    }
    
    @Test
    public void testDisplayGreeting_Evening() {
        // Test displayGreeting with evening time
        LocalTime eveningTime = LocalTime.of(20, 15);
        App.displayGreeting(eveningTime);
        // Method should execute without exceptions
    }
    
    @Test
    public void testMain() {
        // Test main method
        App.main(new String[]{});
        // Method should execute without exceptions
    }
}

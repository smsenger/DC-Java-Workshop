package com.digitalcrafts.workshops.hello.world;

public class Main {

    public static void main(String[] args) {
	//System.out.println("Hello, world!");

	//variables
        //primitive data types
//        int number = 4;
//        double price = 5.5;
//        char letter = 'A';
//        boolean toggle = false;
//        String myName = "Saesha";
//
//        System.out.println("The number is " + number);

        printMessages();

    }

    public static void printMessages() {
        int pets = 0;
        double coffee = 0.20;
        float coffees = 0.20f;
        double latitude = 33.748997;
        double longitude = -84.387985;
        char firstInitial = 'S';
        char lastInitial = 'R';
        String watchlist = "Ozark";

        System.out.println("I have " + pets + " pets.");
        System.out.println("I paid about " + coffee + " for my coffee this morning.");
        System.out.println("I am currently located at " + latitude + ", " + longitude + ".");
        System.out.println("My initials are " + firstInitial + "." + lastInitial + ".");
        System.out.println("I recently watched " + watchlist + ", and it's awesome.");




    }
}

package com.fundamentals.java;

public class Lesson6 {

    String myString = "LaMars";

    // Method shows String method for charAt
    public void exampleCharAt() {
        char myChar = myString.charAt(3);
        System.out.println(myChar);
    }// end method exampleCharAt

    // Method shows concatenation of two strings
    public void exampleConcat(String value) {
        String happy = myString.concat(value);
        System.out.println(happy);
    }

    // Method compares two strings to see if they are equal
    public void exampleEquals(String donut) {
        boolean myBoolean = myString.equals(donut);
        System.out.println(myBoolean);
        // end method exampleEquals
    }

    // method takes a string and converts it to lowercase
    public String exampleLowercase() {
        return myString.toLowerCase();
        // end method exampleLowercase
    }

    // Method takes a string and converts it to uppercase
    public String exampleUppercase() {
        return myString.toUpperCase();
    } // end method exampleUppercase

    // Method determines the length of a string
    public void exampleLength() {
        int length = myString.length();
    } // end method exampleLength

    // Example of how use the StringBuilder class
    public void exampleBuilder(String food, int value) {
        StringBuilder build = new StringBuilder();
        build.append("My favorite food is ");
        build.append(food).append(" and I ate ")
                .append(value).append(" plates of it.");
        String fav = build.toString();
        System.out.println(fav);
    }// end method exampleBuilder

   // Method for showing char data type
    public void exampleChar() {
        char cl = 't';
        char c2 = '\u00A7';
        System.out.println(c2);
    } // end method exampleChar

  // Method demonstrates escape sequences
    public void exampleEscape() {
        System.out.println("That\'s a cool toy.\tCan I\n play with it.");
    } // end method exampleEscape

} //end class Lesson6

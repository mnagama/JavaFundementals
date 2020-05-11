package com.fundamentals.java;

public class House {


    String foundation;
    String roofType;
    String doorColor;
    int windowSize;

    public void doorOpenClose() {
        System.out.println("The door opens");

    } // end method doorOpenClose

    // original method
    public void doorOpenClose(String message) {
        System.out.println(message);
    } // end method doorOpenClose

public House() {
    this("Blue");
} // end constructor

public House(String doorColor) {
     this ( "wood", "composite",doorColor, 30);
     System.out.println("This door color is " +doorColor);
}  // end constructor

public House (String foundation, String roofType, String doorColor, int windowSize) {
    this.foundation = foundation;
    this.roofType = roofType;
    this.doorColor = doorColor;
    this.windowSize = windowSize;
}  // end constructor


}




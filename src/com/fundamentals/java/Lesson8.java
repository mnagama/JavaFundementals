package com.fundamentals.java;
/*
* The contents of this class will go over the Lesson 8 content
* Control Flow Statements
* */
public class Lesson8 {
public void basicIfStatement(int value1, int value2) {
    System.out.println("Before if Statement");
    if (value1 == value2) {
        System.out.println("Values are equal");
    } //end if
    System.out.println("After if Statement");

    } // end method basicIfStatement

    // This method goes over if else
    public void basicIfElseExample(int alpha, int beta) {
        System.out.println("Before if statement");
        if (alpha != beta) {
            System.out.println("The values are not equal");
        } else {
            System.out.println("The values are equal");
        } // end if else
        System.out.println("End of if statement");
    } // end method basicIfElseExample

    // This method goes over the while loop
    public void basicWhileExample() {
        int val = 0; // initialized value
        while (val < 10) { //condition
            System.out.println(val);
            val++; //increment
        } // end while
    } // end method basicWhileExample

     // This method goes over the do while loop
     public void basicDoWhileExample() {
         int able = 0; //initialized value
         do {
             System.out.println(able);
             able++; //increment
         } while(able < 10); //condition
     } // end method basicDoWhileExample

     // This method goes over the for loop
        public void basicForLoopExample() {
            for (int i = 10; i < 20; i++) {
                System.out.println(i);
            } // end for
        }// end method basicForLoopExample

     // This method demonstrates a switch statement with case
     public void basicSwitchExample(int day) {
                switch (day) {
                    case 1:
                        System.out.println("Day = 1");
                        break;
                    case 2:
                        System.out.println("Day = 2");
                        break;
                    case 3:
                    case 4:
                        System.out.println("Day = 3 or 4");
                        break;
                    default:
                        System.out.println("day is greater than 4");
                }// end switch
            }// end method basicSwitchExample









} // end class Lesson8






package com.fundamentals.java;

public class Main {

    public static void main(String[] args) {
       beerSong();
        //lesson12Examples();
        //lesson11Examples();
        //lesson10Examples();
        //lesson9Examples();
        //beerSong();
        //lesson8Examples();
        // lesson7Examples();
        // lesson6Examples();
        // lesson5Examples();

       // write your code here
        // System.out.println("Hello Java");
        // System.out.println("I am new to Java")
        // System.out.println(This Java course is cool")
        // System.out.println("This is my first sentence");
        // System.out.println("I am new to Java")
        // System.out.println("This Java course is cool") +
        // System.out.println("I am learning stuff every day");

        // myHouseExample ();
    } // End main method

    public static void beerSong(){

        BottlesOfBeerSong song = new BottlesOfBeerSong();
        song.timeToSing();
    }

    public static void lesson12Examples() {
        Condo myCondo = new Condo();
        myCondo.doorOpenClose(); // from House parent class
        myCondo.setBalcony("railing"); // from Condo class

        House myHouse =new House();
        myHouse.doorOpenClose("Close");
    } // end method lesson12Examples


public static void lesson8Examples() {
        Lesson8 myEight = new Lesson8();
        myEight.basicIfStatement(2,2);
        myEight.basicIfElseExample(4,4);

        myEight.basicWhileExample();
        myEight.basicDoWhileExample();
        myEight.basicForLoopExample();
        myEight.basicSwitchExample(2);
    } // end method lesson8Examples


    public static void lesson6Examples() {
        Lesson6 mySix = new Lesson6();
        mySix.exampleCharAt();
        mySix.exampleConcat(" has awesome donuts");
        mySix.exampleEquals("LaMars");
        System.out.println(mySix.exampleLowercase());
        System.out.println(mySix.exampleUppercase());
        mySix.exampleLength();
        mySix.exampleBuilder("Fish", 2);

    }

    public static void myHouseExample() {
        House myHouse = new House();
        myHouse.doorOpenClose("Close");

        // myHouseExample;
    } // End main method

    public static void lesson7Examples() {
        Lesson7 mySeven = new Lesson7();
        mySeven.basicMath();
        mySeven.exampleModulus();
        //mySeven.addTwoNumbers();
        mySeven.exampleAssignment();
        mySeven.exampleLeftShift();
        mySeven.exampleRightShift();
        mySeven.exampleAND();
        mySeven.exampleXOR();
        mySeven.exampleRelational();
        mySeven.exampleIncrement();
        mySeven.exampleDecrement();
    } // end method lesson7Examples






}



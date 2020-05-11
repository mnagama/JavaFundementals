package com.fundamentals.java;
/*
* The contents of this class is for the lesson 5 slide
* deck. Primitive Data Types & more
* */
public class Lesson5  {
    // This primitive type can be true or false only
    boolean myBoolean = true;

    // This primitive type has value range of 0 to 65535
    char myChar  = 'C';

    // This primitive type has a value range of -128 to 128
    byte myByte = 9;

    // This primitive type has a value range of -32768 to 32767
    short myShort = 235;

    /* This primitive type has a value range of
    * -2,147,483,648 to 2,147,483,647 */
    int myInt = 2354;

    /* This primitive type has a value range of
    * -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 */
    long myLong = 56864L;

    // This primitive type has a range of 3.4e-038 to 3.4e+038
    float myFloat =34.53F;
    // This primitive type has a range of 1.7e-308 to 1.7e+308
    double myDouble = 84.98D;
    double myOtherDouble = 36.43;

    // Decimal value of 26
    int value = 26;

    // Hexadecimal value 26
    int value2 =0x1a;

    //Binary value of 26
    int value3 =0b11010;

    // Scientific Notation uses E or e
    double d2 = 23.65E8;

    // Using underscores to make the numberreadable
    long myOtherLong =4_568_987_367L;
    double dd2 = 23_345.3;

    // This method sows a local variable
    public void showLocalExample () {
        int able = 20;
        System.out.println(able);
    }   // end method showLocalExample

    /* This method shows Instance Variable() {
     * inside this method */
    public void showInstanceVarible () {
        System.out.println("Before");
        System.out.println(myDouble);
        System.out.println("After");
        myDouble = 98.6; // 84.98 original value
        System.out.println(myDouble);
    }  //end method showInstanceVarible

      // Th is method has 2 parameters and a return type
      public int showLocalWithReturn (int able,int type2) {
          return able + type2;
      }
     // This method shows implicit and explicit conversion
      public void showConversions () {
              long ll2 = myInt; // implicit or widening conversion
              int val = (int) myLong; // explicit or narrowing cast
              int charlie = (int) myDouble; // explicit or narrowing
              int delta = (int) myOtherLong; // explicit, may show error }

              System.out.println(ll2);
              System.out.println(val);
              System.out.println(charlie);
              System.out.println(delta);
          }


          // end class lesson5


}



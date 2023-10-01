package com.example.lib;

public class MyClass {
    public static void main(String[] args) {
//        System.out.println("hi");

        int age=25;

        System.out.println("My Age: "+age);

        //byte : 8bit: -2^7 to 2^7-1 : -128 --> 127
        //byte x=2;

        //short : 16bit : -2^15 to (2^15)-1

        //int : 32 bit : -2^31 to (2^31)-1

        //long : 64 bit : -2^63 to (2^63)-1 // L or l to end
//        long w=1122334455L;

        //float : F or f to end
//        float pi = 3.14F;

        //double: decimal with higher precision 64 bit

        double myPi = 3.12345;

        //boolean: true or false

        boolean isRaining = true;

        //char : single number,symbol or letter
//        char myChar = 'A';
//        char myNumber = '7';
//        char mySymbol = '$';
//        char newLine ='\n';
//        char tab = '\t';

        //Type casting

        //implicit typecasting
        int numInt = 10;
        double numDouble = numInt; //10.0

        //Explicit Type Casting --> data loss
        double pi = 3.14;
        int numPI= (int) pi; //3

        //Type casting between diff data types
        int myInt = 5;
        char myChar = (char) (myInt + 'A'); //F -> 70

        //Operators
        //+,-,/,%,*


        //Non primitive data types

        //1. String
        String sayHello ="Hello my frnd";
        System.out.println(2+"3");

        //2. Array
        //dataType[] arrayName = new dataType[arrSize];

        int [] numbersArray = new int[5];
        int[][] twoDArray=new int [3][3];

        //for each
//        for(dataType ele:collection/Array){
//            //code
//        }

        // OOPS
        //methods
//        returnType methodName(){
//            //method body
//        }


//        sayHi();

        //Object

        Car blueCar = new Car();
















    }

    static void sayHi(){
        System.out.println("Hi");
    }
}

class Car{
    //states
    int year;
    int speed;


    //methods
    void accelerate(){
        speed+=10;
    }
    void brake(){
        speed-=5;
    }
}
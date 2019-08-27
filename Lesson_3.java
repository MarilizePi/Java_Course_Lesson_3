//Java course started in July 2019
//Introduction to the basics, such as primitive types, basic syntax & calculations.
//LESSON 3 (lessons 1 & 2 were intro + set up).

package academy.learprogramming;

import javax.sound.midi.Soundbank;
import javax.swing.*;

public class Java_Course_Lesson_3 {

    public static void main(String[] args) {

        int myValue = 10000;
        //Integer is a wrapper class. Wrapper classes usually start with
        //a capital letter
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        //"overflow"
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        //"underflow"
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        //A Byte occupies 8 bits (width of 8).
        //A short occupies 16 bits (width of 16).
        //An int occupies 32 bits (width of 32).
        //A long occupies 64 bits (width of 64).

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        int myTotal = (myMinIntValue / 2);
        //In the following statement we will use casting.
        //Casting treats or converts a number from one type to another.
        //It is recommended to use an int, unless a good reason otherwise.
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        //VIDEO 27: PRIMITIVE TYPES CHALLENGE

        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long myLongTotal = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println("The result is: " + myLongTotal);

        //VIDEO 28: FLOAT AND DOUBLE PRIMITIVE TYPES

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5d;

        //VIDEO 29

        System.out.println("My Int Value = " + myIntValue);
        System.out.println("My Float Value = " + myFloatValue);
        System.out.println("My Double value = " + myDoubleValue);

        //Challenge video 29
        double numberOfPounds = 200d;
        double convertToKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms = " + convertToKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

        //VIDEO 30

        //Char can only store one character at a time.
        //A char also occupies 2 bytes of memory (16 bits, width of 16).
        //It allows you to store Unicode characters.

        char myChar = 'M';
        char myUnicodeChar = '\u0044';
        System.out.println(myUnicodeChar); //It has to print the letter "D".

        //Boolean type can only be set, in Java, to true or false.

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;

        //VIDEO 31

        //The String data type in Java is not a primitive type,
        //but actually a Class. It can contain a sequence of character.
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString); //when it prints, it doesn't add,
        //but prints as a sequence. String don't do calculations,
        // unless converted to another data type.
        String lastString = "10";
        int myInt2 = 50;
        lastString = lastString + myInt2; //Adding a numeric data type value to a String.
        System.out.println("lastString is equal to " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber; //"converting" a double into a String;
        System.out.println("lastString is equal to " + lastString);
        //Appending values like this is inefficient and not recommended.
        //A better way of doing it is a StringBuffer, which will be discussed
        //in future lectures. *We need to understand classes before StringBuffer.

        //VIDEO 32 - OPERATORS, OPERANDS AND EXPRESSIONS

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; //3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; //2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; //20 / 5 = 4;
        System.out.println("20 / 5 = " + result);

        result = result % 3; //the remainder of (4 % 3) = 1;
        System.out.println("4 % 3 = " + result);

        //VIDEO 33

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2;
        result += 2; //1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        //result  = result * 10;
        result *= 10; //3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        //result = result / 3;
        result /= 3; //30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        //result = result - 2;
        result -= 2; //10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        //VIDEO 34 - IF-THEN STATEMENT

        //Most basic of all the control flow statements. It tells the program
        //to execute a certain section of code only if a particular test
        //evaluates to true. This is known as conditional logic.

        boolean isAlien = false;
        if (isAlien) //if set to true it won't run
        {
            System.out.println("It is not an alien!");
            System.out.println("An I am scared of aliens");
        }

        //VIDEOS 35/36 LOGICAL AND/OR OPERATOR

        int topScore = 80;
        if (topScore != 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) //the single & is
        //a bitwise operator (advanced concept learned in later lessons.
        {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        //VIDEO 37 - CHALLENGE

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        //VIDEO 38 - TERNARY OPERATOR

        //The ternary operator is a shortcut to assigning one of two values
        //to a variable depending on a given condition.
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        //VIDEO 39 - OPERATOR PRECEDENCE AND OPERATOR CHALLENGE

        double testDouble = 20.00d;
        double testSecondDouble = 80.00d;
        double calculateBothDoubles = (testDouble + testSecondDouble) * 100.00d;
        System.out.println("calculateBothDoubles = " + calculateBothDoubles);
        double theRemainderIs = calculateBothDoubles % 40.00d;
        System.out.println("theRemainderIs = " + theRemainderIs);
        boolean notRemainderValue = (theRemainderIs == 0) ? true : false;
        System.out.println("notRemainderValue = " + notRemainderValue);
        if (!notRemainderValue) {
            System.out.println("Got some remainder");
        }

        //VIDEO 43 - KEYWORDS AND EXPRESSIONS

        //a mile is equal to 1.603344 km
        double kilometers = (100 * 1.603344);
        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is an expression.");
        }
    }
}

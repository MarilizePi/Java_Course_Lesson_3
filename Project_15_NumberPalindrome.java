//A Palindrome number is a number which when reversed is equal to the original number.
//Ex: 121, 12321, 1001, etc.

//THE LOGIC BEHIND THIS CODE:
/* First of all, I need a number to compare its reverse.
 * Second, I can create a variable called "number".
 * Third, I need another variable to store the remainder. I called it "remainder" :)
 * Fourth, I need another variable to store the reversed number. I called it "reverseNumber.
 * In order to calculate the remainder, I have to apply the module operator (%) to get the last digit.
 * Fifth, I have to break down my number, so I remove the last digit and stay with the remaining number.
 * Sixth, my reverse number is zero by default. So, multiplying zero and 10, I get zero, + my remainder, which is the "remainder" number.
 * The loop will go on until it checks the whole number and it gives me the result: true or false.
 * ATTENTION: I also need an "if statement" to compare "number" and "reverseNumber". For this,
 * I created a variable called "compareInputAndOutput and set it equal to number, because we want the result to be true.*/

public class Project_15_NumberPalindrome {

    public static void main(String[] args) {
        isPalindrome(9555559);
        isPalindrome(123);
        isPalindrome(-222);
        isPalindrome(0);
        isPalindrome(45433);
    }

    public static boolean isPalindrome(int number) {
        int remainder;
        int reverseNumber = 0;
        int compareInputAndOutput = number;

        //MY FAVORITE PART/BLOCK OF CODE
        while (number != 0) {
            remainder = number % 10;
            number = number / 10;
            reverseNumber = (reverseNumber * 10) + remainder;
        } //END OF FAVORITE PART

        if (compareInputAndOutput == reverseNumber) {
            System.out.println("The number " + compareInputAndOutput + " is Palindrome");
            return true;
        } else {
            System.out.println("The number " + compareInputAndOutput + " is NOT Palindrome");
            return false;
        }
    }
}

/*
OUTPUT

The number 9555559 is Palindrome
The number 123 is NOT Palindrome
The number -222 is Palindrome
The number 0 is Palindrome
The number 45433 is NOT Palindrome

Process finished with exit code 0

 */

//THIS LESSON FOCUSES ON:
//Expressions
//Statements
//Code Blocks
//Methods

package com.marilize;

public class lesson_4 {

    public static void main(String[] args) {


        //VIDEO 43 - KEYWORDS AND EXPRESSIONS

        //A keyword has a predefined meaning in java programming
        //There is ~53 keywords which "cannot be used as identifiers
        //for naming variables, classes, methods or other entities".
        //Ex: int int = 5; won't run. int int2 = 5; is correct.

        //Create an expression to convert miles to kilometers

        //a mile is equal to 1.609344 km
        double kilometers = (100 * 1.609344);
        //The above (kilometers = (100 * 1.609344)) is an expression.
        //It contains variables, values and operators.
        //we create a statement by combining the data type and semicolon.
        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is an expression.");
        }

        //VIDEO 44 - STATEMENTS, WHITESPACE & INDENTATION

        int myVariable = 50; //This whole thing is a statement.
        myVariable++; //This is also a statement.
        myVariable--; //This is also a statement.
        System.out.println("This is a test"); //This is a complete statement.

        System.out.println("This is "
                + "another "
                + "test.");

        //Java ignores whitespaces. Whitespaces are the space between
        //every word. Ex. the space between the data type and its assignment.
        //We need to be careful with whitespaces and indentation,
        //because we need to create readable/understandable code.

        //VIDEO 45 - CODE BLOCKS & THE IF THEN ELSE CONTROL STATEMENTS

        /*boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;*/

        //The if statement below is a code block as long as the other
        //statements/expressions are inside of the its brackets.

        /*if (score == 5000)
        {
            System.out.println("Your score was 5000.");
        } //In this case, the brackets are optional, if you only have
        //one statement.
        System.out.println("This was executed.");*/

       /* if (score < 5000 && score > 1000)
        {
            System.out.println("Your score was less than 5000" +
                    "but greater than 1000.");
        }
        else if (score < 1000)
        {
            System.out.println("Your score was less than 1000.");
        }
        else
        {
            System.out.println("Got here.");
        }*/

        /*if (gameOver) //== true
        {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }*/
        //A code block can access variable outside of the code block.
        //A variable created inside of a code block cannot be accessed
        //outside of the code block.
        //A variable inside of a code block is called scope.

        /*VIDEO 45 CHALLENGE

        Print out a second score on the screen with the following
        score set to 10000
        levelCompleted set to 8
        bonus set to 200
        But make sure the first printout above still displays as well*/

       /* score = 10000;
        levelCompleted = 8;
        bonus = 200;*/
        //This is a good approach to reuse variables.
        //However, in the long run, by using this duplicate code,
        //you can lose track of the variables and the code blocks they
        //are being use, and it will become harder to debug the code.

        /*if (gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }*/

        //VIDEO 46 - RECAP IF THEN ELSE

        /*if (condition)
        {
            if statement (block)
        }
        else
        {
            else statement (block)
        }*/

        //The next video will show how to remove duplication by using methods.

        //VIDEOS 47, 48 & 49 - METHODS

        //"Take the value that is returned from the method 'calculateScore'
        //and put that into the variable called "highScore".
        int highScore1 = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore1);

        highScore1 = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore1);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Mari", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Hugo", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Molly", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Arsenic", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Malo", highScorePosition);
    }

    //This is a method
    //Inside the parenthesis, we create parameters, which will help
    //us to not duplicate code.
    //We can also make calculations and send the result back to the code
    //that was actually calling the method in the first place.
    //The "void" does not send any value back.
    //If we want to return something, we need to change the word void to the
    //data type of the info we'll send back.
    public static int calculateScore(boolean gameOver, int score,
                                     int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
            //We need to return a value if it is true and also not true.
            //That is why we add an extra line of code in the end,
            //such as the following "return -1;".
        }

        return -1; //-1 is conventionally used to indicated an error.
        //In searching algorithms, -1 indicated an invalid value or a
        //value not found.
    }


    //CHALLENGE
    // Create a method called displayHighScorePosition
    // it should a players name as a parameter,
    // and a 2nd parameter as a position in the high score table
    // You should display the players name along with a message like
    //" managed to get into position " and the
    // position they got and a further message " on the high score table".
    // Create a 2nd method called calculateHighScorePosition
    // it should be sent one argument only, the player score
    // it should return an in
    // the return data should be
    // 1 if the score is >=1000
    // 2 if the score is >=500
    // 3 if the score is >=100
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400 and 50

    public static void displayHighScorePosition(String playerName, int highScorePosition)
    {
        System.out.println(playerName + " managed to get into position "
        + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore)
    {
        /*if (playerScore >= 1000)
        {
            return 1;
        }
        else if (playerScore >= 500)
        {
            return 2;
        }
        else if (playerScore >= 100)
        {
            return 3;
        }
        return 4;*/

        int position = 4; //assuming position 4 will be returned.

        if (playerScore >= 1000)
        {
            position =1;
        }
        else if (playerScore >= 500)
        {
            return 2;
        }
        else if (playerScore >= 100)
        {
            return 3;
        }

        return position;
    }

}

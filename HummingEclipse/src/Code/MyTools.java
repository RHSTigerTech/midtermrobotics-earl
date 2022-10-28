package Code;
/*
* Name: Tyler Larson
*
* Date: 09/06/22
*
* File: MyTools.java
*
* Description: Read the values inputed by the user. Creating a static method for safely reading ints, doubles, and Strings.
*               
*
*/

import java.util.Scanner;

public class MyTools {
    /**s
     * 
     * @param prompt The promp inputed by the user
     * @return The prompt given if it was the right variable type
     */
    public static int readInt(String prompt) {

    //initialize a Scanner object
    Scanner userInput = new Scanner(System.in);

    //Print the prompt that the user wants to use
    System.out.print(prompt);

    //Check to see if the user entered an integer
    //if they did, the while loop gets skipped b/c of the not operator !
    //it the user did not enter an integer the inside of the loop 
    //gets executed again and again re-prompting until the user enters an int
    while(!userInput.hasNextInt()) {
        userInput.nextLine();                   //This takes whatever non integer the user entered and throws it away
        System.out.print("Error\n" + prompt);   //This prints Error then re-prompts the user
    }

    //save the users input into a variable
    int number = userInput.nextInt();

    //return the variable storing the users input
    return number;
    } 
    public static double readDouble(String prompt) {
        Scanner userInput = new Scanner(System.in);

        //Print the prompt that the user wants to use
        System.out.print(prompt);

        //Check to see if the user entered an integer
        //if they did, the while loop gets skipped b/c of the not operator !
        //it the user did not enter an integer the inside of the loop 
        //gets executed again and again re-prompting until the user enters an int
        while(!userInput.hasNextDouble()) {
            userInput.nextLine();                   //This takes whatever non integer the user entered and throws it away
            System.out.print("Error\n" + prompt);   //This prints Error then re-prompts the user
        }
    
        //save the users input into a variable
        double number = userInput.nextDouble();

        //return the variable storing the users input
        return number;
        } 
    public static String readString(String prompt) {
        //initialize a Scanner object
        Scanner userInput = new Scanner(System.in);

        //Print the prompt that the user wants to use
        System.out.print(prompt);

        // A while loop is unecessary in this method since anything the user can input can be cast as a String, it does not need to be a specific thing like int or double.

        //save the users input into a variable
        String thing = userInput.nextLine();

        //return the variable storing the users input
        return thing;
            } 
    public static int findPosInt(String prompt) {
        int num = MyTools.readInt(prompt);
        while (num < 0) {
            num = MyTools.readInt("Error. Please enter a positive integer: ");
        }
        return num;
    }
}
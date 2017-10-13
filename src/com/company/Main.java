/*
Yonatan Mengesha
October 12
Fizz Buzz project
Java Boot camp
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Creating a scanner object named scan
        Scanner scan= new Scanner(System.in);
        int number,anotherNumber,CountOfMultipleofSeven=0;
        int CountOfMultipleOfTheOtherNumber=0,CountOfMultipleOfSeventeen=0,CountOfMultipleOfTwentyThree=0;

 //do while condition that validates if the number is greater or equal to or grater than one
        do
        {
            //Askes the user to enter a number and accepts from the keyboard
            System.out.println("Enter the number:");

            number= scan.nextInt();
            scan.nextLine();
            System.out.println();

            //Askes the user to enter another number to check if it is multiple of the first number
            System.out.println ("Enter Another Number To Check if it is multiple of the FirstNumber:" );
            anotherNumber=scan.nextInt ();
            scan.nextLine ();
            System.out.println ( );


            //For loop that starts from one up to the number entered
            for(int i=1;i<=number;i++)
            {
                String value= " ";

                //if the number is multiple of 3 displays Fizz
                if(i%3==0)
                    value=value+"Fizz";
                //if the number is multiple of 5 displays Buzz
                if(i%5==0)
                    value=value+"Buzz";
                //else if the number is multiple of 3 and 5 it concatenates  Fizz with Buzz and displays FizzBuzz
                if(value.equalsIgnoreCase(" "))
                    value=value+i;
                //if the above conditions are not true displays the value which is a number
                System.out.println(value);

                 //counts  the multiple of seven
                if(i%7==0)
                    CountOfMultipleofSeven=CountOfMultipleofSeven+1;
                //counts  the multiple of seventeen
                if(i%17==0)
                    CountOfMultipleOfSeventeen=CountOfMultipleOfSeventeen+1;
                //counts  the multiple of twenty three
                if(i%17==0)
                    CountOfMultipleOfTwentyThree=CountOfMultipleOfTwentyThree+1;
                //counts  the multiple of twenty three
                if(i%anotherNumber==0)
                    CountOfMultipleOfTheOtherNumber=CountOfMultipleOfTheOtherNumber+1;

            }
            //Displays the result
            System.out.println();
            System.out.println("The number of Count of Multiple of 7 is : "+CountOfMultipleofSeven);
            System.out.println("The number of Count of Multiple of 17 is : "+CountOfMultipleOfSeventeen);
            System.out.println("The number of Count of Multiple of 23 is : "+CountOfMultipleOfTwentyThree);
            System.out.println("The number of Count of Multiple of 23 is : "+CountOfMultipleOfTheOtherNumber);
            System.out.println();

            //if the number is less than or equals to one asks the user to enter a number grater than one
            if(number<=1)
                System.out.println("Enter a number greater than one");
        }while(number<=1||number>1);




    }
}

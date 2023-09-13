//  FOR LOOP

/*
Main difference between for and while is
FOR LOOP is used when the user wants to purposely end the program and run it till he requires the result.
WHILE LOOP is used when the user doesnt know when the condition satisfies.

example:

FOR loop will be used when there will be 10 packets of rice to be emptied, and the user will be knowing 
the limit of the total number of packets.

Whereas,

WHILE loop will be used when there will be n number of packets of rice to be emptied, and he doesnt know 
the limit of the total packets of the rice.
*/



/*
import java.util.Scanner;

public class Tut23 
{
    public static void main(String[] args) 
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a number");
        int number1 = scan1.nextInt();
        System.out.println("The user defined number is : " + number1);

        int product;

        for (int i = 1; i < 11; i++)
        {
            product = number1 * i;
            System.out.printf("%d * %d = %d\n",number1,i,product);
        }
        scan1.close();
    }
}
*/


/* OUTPUT 
Enter a number
22
The user defined number is : 22
22 * 1 = 22
22 * 2 = 44
22 * 3 = 66
22 * 4 = 88
22 * 5 = 110
22 * 6 = 132
22 * 7 = 154
22 * 8 = 176
22 * 9 = 198
22 * 10 = 220
*/



// To Print even numbers

/* 
import java.util.Scanner;

public class Tut23 
{
    public static void main(String[] args) 
    {
        System.out.println("Program to print all the Even numbers till User defined value");
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a number");
        int number1 = scan1.nextInt();
        System.out.println("The user defined number is : " + number1);

        for (int i = 0; i <= number1; i++)
        {
            if (i%2==0) 
            {
                System.out.println(i);
            }
            else
            {
                System.out.println(i +" is an odd number");
            }
        }
        scan1.close();
    }
}
*/


/* OUTPUT
Program to print all the Even numbers till User defined value
Enter a number
7
The user defined number is : 7
0
1 is an odd number
2
3 is an odd number
4
5 is an odd number
6
7 is an odd number
*/



/* Program to print numbers in reversed order till User defined value

import java.util.Scanner;

public class Tut23 
{
    public static void main(String[] args) 
    {
        System.out.println("Program to print numbers in reversed order till User defined value");
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a number");
        int number1 = scan1.nextInt();
        System.out.println("The user defined number is : " + number1);

       for (int i = number1 ; i > 0 ; i--)
       {
            System.out.println(i);
       }
        scan1.close();
    }
}
*/


/* OUTPUT
Program to print numbers in reversed order till User defined value
Enter a number
5
The user defined number is : 5
5
4
3
2
1
*/
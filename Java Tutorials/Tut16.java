// IF ELSE Statements in JAVA


// basic if else statement

/*
import java.util.Scanner;

public class Tut16
{
    public static void main(String[] args) 
    {
        System.out.println("Hello World !!!");

        Scanner scan1 = new Scanner(System.in);

        System.out.println("Enter the value of a : ");
        int a = scan1.nextInt();

        System.out.println("Enter the value of b : ");
        int b = scan1.nextInt();

        System.out.println("Enter the value of c : ");
        int c = scan1.nextInt();

        if (a>b && a<c)
        {
            System.out.println("value of a is greater than b and c");
        }

        if (a<b && c<b)
        {
            System.out.println("value of b is greater than a and c");
        }

        if (c>b && a<c)
        {
            System.out.println("value of c is greater than b and a");
        }

        scan1.close();

    }
}
*/


/* OUTPUT
Hello World !!!
Enter the value of a : 
22
Enter the value of b : 
33
Enter the value of c : 
44
value of c is greater than b and a
*/



/* Nested IF ELSE Example

import java.util.Scanner;

public class Tut16
{
    public static void main(String[] args) 
    {
        Scanner scan1 = new Scanner (System.in);

        System.out.println("Enter your age : ");
        int age = scan1.nextInt();
        System.out.printf("The age of the person is : %d\n", age);

        if (age > 18)
        {
            System.out.println("You can enter the party\n");
            if (age >= 21)
            {
                System.out.println("You can have a drink\n");
                if (age > 30)
                {
                    System.out.println("You can have some weed too\n");
                }
                else
                {
                    System.out.println("Just have some drinks and Enjoy the party\n");
                }
            }
            else
            {
                System.out.println("Just Enjoy the party\n");
            }
        }
        else
        {
            System.out.println("You cant enter the party\n");
        }
        scan1.close();
    }
}
*/


/* OUTPUT

Enter your age : 
35
The age of the person is : 35
You can enter the party

You can have a drink

You can have some weed too

*/



//  ELSE IF ELSE statement example

/*
import java.util.Scanner;

public class Tut16
{
    public static void main(String[] args) 
    {
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str1 = scan1.nextLine();
        System.out.printf("The entered string in Str1 is : %s\n", str1);

        if (str1.equals("Aniket Shinde is Best"))
        {
            System.out.println("The entered string is equal to the original string via If !!!");
        }

        else if (str1.equalsIgnoreCase("Aniket Shinde is Best"))
        {
            System.out.println("The entered string is equal to the original string via Else if !!!");
        }

        else
        {
            System.out.print("The Entered string is not equal and incorrect in upper and lower cases !");
            System.out.println(" Try Again !");
        }
        scan1.close();
    }
}
*/


/* OUTPUT

Enter the String : 
AniKeT ShinDe is bEst
The entered string in Str1 is : AniKeT ShinDe is bEst
The entered string is equal to the original string via Else if !!!

*/
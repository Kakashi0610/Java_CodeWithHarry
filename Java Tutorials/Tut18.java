/* SWITCH CASE syntax

switch(var) 
{
    Case C1:
    {
    	//Code
    }
    break;

    Case C2:
    {
    	//Code
    }
    break;	

    Case C3:
    {
    	//Code
    }
    break;

    default:
    {
        //Code
    }
}
*/



/* Switch Case example

import java.util.Scanner;

public class Tut18
{
    public static void main(String[] args) 
    {

        Scanner scan1 = new Scanner(System.in);

        System.out.println("Enter the marks : ");
        int marks = scan1.nextInt();
        System.out.printf("The marks entered are : %d\n", marks);

        switch (marks) 
        {
            case (60):
            {
                if (marks>60 && marks<100)
                {
                System.out.println("Test case 1 cleared");
                }
                break;
            }

            case (70):
            {
                if (marks>60 && marks<100)
                {
                System.out.println("Test case 2 cleared");
                }
                break;
            }

            case (80):
            {
                if (marks>60 && marks<100)
                {
                System.out.println("Test case 3 cleared");
                }
                break;
            }

            case (90):
            {
                if (marks>60 && marks<100)
                {
                System.out.println("Test case 4 cleared");
                }
                break;
            }

            default:
            {
                System.out.println("You entered invalid marks");
            }
        }
        scan1.close();
    }
} 
*/  


/* OUTPUT
Enter the marks : 
80
The marks entered are : 80
Test case 3 cleared
*/



/* By using String

import java.util.Scanner;

public class Tut18
{
    public static void main(String[] args) 
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str1 = scan1.nextLine();
        System.out.printf("The string str is : %s\n", str1);

        switch (str1)
        {
            case ("Manya") :
            {
                System.out.println("The string by case is Manya");
                break;
            }

            case ("Aniket") :
            {
                System.out.println("The string by case is Aniket");
                break;
            }
            
            case ("kakashi") :
            {
                System.out.println("The string by case is kakashi");
                break;
            }
            
            default:
            {
                System.out.println("This is the default if you entered wrong or unmatched input");
            }
            scan1.close();
        }
    }
}
*/


/* OUTPUT

Enter the String : 
Manya
The string str is : Manya
The string by case is Manya

 */





























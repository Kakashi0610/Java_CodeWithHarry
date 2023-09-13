// Introduction to STRINGS

/*  new method for Strings typing ---> Line 29

String str_name = new String();
str_name = " value ";
System.out.println(str_name);


// C language ki method bhi use kar sakte hai  ---> Line 31 and 38

System.out.printf("the name is %s\n",str1);  // C language method for string typing
System.out.format("the name is %s\n",str1);  // C language method for string typing
*/


/*
import java.util.Scanner;

public class Tut13 
{
    public static void main(String[] args) 
    {
        System.out.println("hello world !!!");

        // String str = "aniket here";  // old method for using string
        // System.out.println(str);

        String str1 = new String();   // new method for using string
        str1 = "Aniket Shinde";
        System.out.printf("the name is %s\n",str1);  // C language method for string typing

        float f5 = 33.33f;
        // for small space before any datatype value
        System.out.format("the number is %10.5f\n",f5);

        //System.out.println("The name is : " + str1);  // new method for typing string directly
        //System.out.format("the name is %s\n",str1);  // C language method for string typing

        // for user input line printing in terminal
        Scanner scan1 = new Scanner (System.in);
        String str5 = scan1.nextLine();
        System.out.println("the string is : " + (str5));

        scan1.close();
    }
}
*/


/*OUTPUT
hello world !!!
the name is Aniket Shinde
the number is   33.33000
aniket is a good guy
the string is : aniket is a good guy
*/
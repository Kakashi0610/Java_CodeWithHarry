// INPUT from USER in JAVA

/*
import java.util.Scanner;    //in header

//for INTEGER, FLOAT, BTYE

Scanner obj_name = new Scanner(System.in);     // in main function
int/float var_name = obj_name.nextInt/Float;   // to store the input from the user in the variable name
System.out.println(var_name); //for output in terminal


// for CHARACTER 

String var_name = obj_name.next();
System.out.println(var_name);  1


// For STRING

String var_name = obj_name.next();
String var_name2 = obj_name.nextLine();
System.out.println(var_name1 + var_name2);

*/



/* 
import java.util.Scanner;

public class Tut5 {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");

        // sc is an object name of Class Scanner... can be replaced with anything
        Scanner sc = new Scanner(System.in);

        // FOR INTEGER
        System.out.println("Enter number 1 : ");
        // is used to take input as an integer for the user
        int a = sc.nextInt();

        System.out.println("Enter number 2 : ");
        int b = sc.nextInt();

        int c = a + b;

        System.out.print("the sum of 2 numbers is : ");
        System.out.println(c);
        System.out.println("The SUM of INTEGERS is Printed successfully\n");

        // FOR FLOAT
        System.out.println("Enter number 3 : ");
        float d = sc.nextFloat();

        System.out.println("Enter number 4 : ");
        float e = sc.nextFloat();

        float f = d * e;

        System.out.print("The Product of two numbers is : ");
        System.out.println(f);
        System.out.println("The PRODUCT of FLOATS is Printed successfully\n");

        //FOR CHARACTER / ONE WORD
        System.out.println("Enter the Word or Character : ");
        String char1 = sc.next();
        System.out.print("The word is : ");
        System.out.println(char1);

        // FOR STRING / FULL LINE
        String str = sc.next();
        String newstr = sc.nextLine();
        System.out.print("The given string is : ");
        System.out.println(str + newstr);

        sc.close();
    }
}
*/


/* OUTPUT 

Taking input from the user
Enter number 1 : 
11
Enter number 2 : 
33
the sum of 2 numbers is : 44
The SUM of INTEGERS is Printed successfully

Enter number 3 :
33
Enter number 4 : 
44
The Product of two numbers is : 1452.0
The PRODUCT of FLOATS is Printed successfully

Enter the Word or Character :
Aniket
The word is : Aniket
Aniket is a good boy
The given string is : Aniket is a good boy

*/
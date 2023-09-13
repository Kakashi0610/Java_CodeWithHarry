// VARIABLES and DATATYPES in Java

// IMP - when class ends, a semicolon is not needed in Java

/* IMP
for printing in termial, if you want to print string + value in same line 
System.out.print("theory");   // only print in first line
System.out.println(var_name);  // println in second line

 

Variable names :
1. variable names = cannot start with a number.  Example: 2niket
 
2. variable names are case sensitive.  Example harry and Harry are different
 
3. variable names should not be a key word.  Example: println, void, static, class.
 
4. variable names should not include spaces in between.  Example: code with harry 


Data Types :
Data types in Java fall under the following categories

1. Primitive Data Types (Intrinsic)

2. Non-Primitive Data Types (Derived)


1. Primitive Data Types :
Java is statically typed, i.e., variables must be declared before use. Java supports 8 primitive data types:

DATA TYPES	|   SIZE	      |     VALUE RANGE
---------------------------------------------------
1. Byte	    |  1 byte	      |  -128 to 127
2. short    |  2 byte	      |  -32,768 to 32,767
3. int	    |  4 byte	      |  -2,147,483,648 to 2,147,483,647
4. float    |  4 byte	      |   3.40282347 x 1038 to 1.40239846 x 10-45
5. long	    |  8 byte	      |  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
6. double   |  8 byte	      |   1.7976931348623157 x 10308, 4.9406564584124654 x 10-324
7. char	    |  1 byte	      |   0 to 65,535
8. boolean  | Depends on JVM  |  True or False
*/



/* Datatypes examples

public class Tut3   // when class ends, a semicolon is not needed in Java
{
    public static void main(String[] args) 
    {
        System.out.println("Hello, World!"); 

        int num1 = 6;
        System.out.println(num1);

        float num2 = (float)12.22;
        System.out.println(num2);

        int num3 = 18223344;
        System.out.println(num3);

        double num4 = 2.556664;
        System.out.println(num4);

        int num5 = 30;
        System.out.println((float)num5);   // typecasting
    }
}
*/


/* OUTPUT
Hello, World!
6
12.22
18223344
2.556664
30.0
*/



// WAP to add three numbers

/*
public class Tut3
{
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        int num1 = 6;
        int num2 = 13;
        int num3 = 16;
        int num4 = num1 + num2 + num3;
        System.out.print("The sum of 3 numbers is : ");  // for op in one line.. print

        //System.out.println("The sum of 3 numbers is : ");  // for op in multiple lines.. println
        //System.out.println((num1 + num2 + num3));   // can work too
        System.out.println((num4));
    }
}
*/


/* OUTPUT
Hello, World!
The sum of 3 numbers is : 35
*/
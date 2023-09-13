//Associativity of Operators in JAVA

// flows from left to right
//  * multipplication and / division have highest precedence over addition and substraction
// first multiplication and division is carried simultaneously leaving addition and subtraction as it is.
// then addition and subtraction are carried


/*
public class Tut9 
{
    
    public static void main(String[] args) 
    {
        int a = 6 * 5 - 34 / 2;

        //using presedence and associativity
        //30-17
        System.out.println(a); // 13


        int b = 6 / 5 - 34 * 2;

        //using presedence and associativity
        //1-67
        System.out.println(b); // -67


        int c = 4 * 8 + 5 / 2 + 10 * 5 * 3 - 12 + 25;

        //using presedence and associativity
        //32 + 2 + 150 - 12 + 25
        System.out.println(c); // 197


        int d = 30 * 8 / 4 + 25 + 70 - 4 * 3 - 20 + 45 * 5;

        //using presedence and associativity
        //60 + 25 + 70 - 12 -20 + 225
        System.out.println(d); // 348

        // b*b - 4ac whole divided by 2*l
        int l = 2;
        int m = 3;
        int n = 5;
        
        int o = (m*m - 4*l*n)/(2*l);
        System.out.println(o);  // -7
    }
}
*/


/* OUTPUT 
13
-67
197
348
-7
*/


/* timepass -- nahi hua solve...but no errors

import java.util.Scanner;

public class Tut9
{
    public static void main(String[] args) 
    {
        Scanner scan1 = new Scanner(System.in);

        // System.out.print("aniket ");
        // System.out.print("is a ");
        // System.out.print("very good ");
        // System.out.println("boy.");

        System.out.println("Enter operator and number alternately : ");
        int str1 = scan1.nextInt();
        String str2 = scan1.next();
        int str3 = scan1.nextInt();
        String str4 = scan1.next();
        int str5 = scan1.nextInt();
        String str6 = scan1.next();
        int str7 = scan1.nextInt();

        System.out.print("The total value calculated is : ");
        System.out.println(str1 + str2 + str3 + str4 + str5 + str6 + str7);

        scan1.close();
    }
}
*/


/* OUTPUT
Enter operator and number alternately : 
10
+
10
+
10
+
10
The total value calculated is : 10+10+10+10
*/
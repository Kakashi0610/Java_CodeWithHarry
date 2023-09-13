// LOGICAL or operators

/*
for AND operator -- Ek bhi False, sab False honge
false and true = false   0
true and false  = false  0
false and false = false  0 
true and true = true     1
*/


/* 
For OR operator -- Ek bhi True, sab True honge
false and true = True   1
true and false  = True  1
true and true = true    1
false and false = false 0 
*/

/*
NOT operator 
Negates the given logic (true becomes false and vice-versa)

!true = false                         
!false = true 
*/


/*  AND, OR, NOT Examples

public class Tut17 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello world !!!\n");

        //For AND operator

        boolean a = false;
        boolean b = false;

        System.out.println("For AND operator"); 
        if (a && b )
        {
            System.out.println("Yes\n");
        }

        else 
        {
            System.out.println("No\n");
        }



        //For OR operator

        boolean d = false;
        boolean e = false;
        boolean f = true;

        System.out.println("For OR operator"); 
        if (d || e || f)
        {
            System.out.println("Yes\n");
        }
        else
        {
            System.out.println("No\n");
        }



        //For NOT operator

        boolean l = false;

        System.out.println("For Logical Not operator");

        if (l != true)
        {
            System.out.println("l is false\n");
        }

        else if (l != false)
        {
            System.out.println("l is true\n");
        }

        else
        {
            System.out.println("l is not defined\n");
        }

        boolean p = false;
        boolean q = false;
        boolean r = true;
        

        System.out.println("Using ! not optr, the value changes from true to false and vice versa");
        System.out.println(!p);
        System.out.println(!q);
        System.out.println(!r);
    }
}
*/


/*  OUTPUT

Hello world !!!                                                                                                                                       
For AND operator
No

For OR operator
Yes

For Logical Not operator
l is false

Using ! not optr, the value changes from true to false and vice versa
true
true
false
*/
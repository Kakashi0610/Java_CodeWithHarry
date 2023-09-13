// OPERATORS and EXPRESSIONS in JAVA

/* 

Types of operators :

1. ARITHEMATIC OPERATORS :  Line 112

Arithmetic operators are used to perform mathematical operations such as addition, division, etc on expressions.
Arithmetic operators cannot work with Booleans.
% operator can work on floats and doubles.
Let x=7 and y=2

Operator	        Description	                                 Example 
+ (Addition)	    Used to add two numbers.	                 x + y = 9
- (Subtraction)	    Used to subtract two numbers.	             x - y = 5
* (Multiplication)	Used to multiply two values.	             x * y = 14
/ (Division)	    Used to divide two numbers.	                 x / y = 3
% (Modulus)	        Used to print the remainder after dividing.	 x % y = 1
++ (Increment)	    Increases the value of operand by 1.	     x++ = 8
-- (Decrement)	    Decreases the value of operand by 1.	     y-- =  1

-----------------------------------------------------------------------------------------------------------------------------------

2. COMPARISON OPERATORS :  Line 161

As the name suggests, these operators are used to compare two operands.
Let x=7 and y=2

Description                  

1. == (Equal to)
Checks if two operands are equal. Returns a boolean value.
x == y --> False                                                      

2. != (Not equal)
Checks if two operands are not equal. Returns a boolean value.	
x != y --> True                                                       

3. > (Greater than)
Checks if the left-hand side value is greater than the right-hand side value. 
Returns a boolean value.	
x > y --> True                

4. < (Less than)
Checks if the left-hand side value is smaller than the right-hand side value. 
Returns a boolean value.	
x < y --> False               

5. >=(Greater than or equal to)
Checks if the left-hand side value is greater than or equal to the right-hand side value. 
Returns a boolean value.	
x >= y --> True  

6. <= (Less than or equal to)
Checks if the left-hand side value is less than or equal to the right-hand side value.  
Returns a boolean value.	
x <= y -->False       

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

3. LOGICAL OR CONDITIONAL OPERATORS : Line 184

These operators determine the logic in an expression containing two or more values or variables.
Let x = 8 and y =2
&& (logical and)	Returns true if both operands are true.	
x>y && x!=y --> True
x>y && x==y --> false
x<y && x==y --> false  // since x<y is false... returns false
!(x<y && x==y) -->  True

|| (logical or)  	Returns true if any of the operand is true.	x<y && x==y --> True
! (logical not)  	Returns true if the result of the expression is false and vice-versa	

----------------------------------------------------------------------------------------------------------------------------------

4. BITWISE OPERATORS :   (probably not necessary for basics)

These operators perform the operations on every bit of a number.
Let x =2 and y=3. So 2 in binary is 100, and 3 is 011. 

Operator 	       Description	                                Example
& (bitwise and)	   1&1 =1, 0&1=0,1&0=0,1&1=1, 0&0 =0	        (A & B) = (100 & 011) = 000
| (bitwise or)	   1&0 =1, 0&1=1,1&1=1, 0&0=0	                (A | B)  = (100 | 011 ) = 111
^ (bitwise XOR)	   1&0 =1, 0&1=1,1&1=0, 0&0=0	                (A ^ B) = (100 ^ 011 ) = 111
<< (left shift)	   optr moves val left by num of bits speci. 	13<<2 = 52(decimal)
>> (right shift)   optr moves val left by num of bits speci. 	13>>2 = 3(decimal)

------------------------------------------------------------------------------------------------------------------------------------
*/



/* EXAMPLES
import java.util.Scanner;

public class Tut8 {
    public static void main(String[] args) 
    {
        // System.out.println("hello world.");

        // Scanner aniket = new Scanner(System.in);

        // System.out.println("Enter The String : ");
        // String str1 = aniket.next();
        // String str2 = aniket.nextLine();
        // System.out.print("The User typed line is : ");
        // System.out.println(str1 + str2);
        //aniket.close();


        // Arithmetic operators
        int a = 7;
        int b = a + 7;
        System.out.print("val of b is : ");
        System.out.println(b);

        int c = 7;
        int d = c - 7;
        System.out.print("val of d is : ");
        System.out.println(d);

        int e = 7;
        int f = e * 7;
        System.out.print("val of f is : ");
        System.out.println(f);

        int g = 35;
        int h = g / 7;
        System.out.print("val of h is : ");
        System.out.println(h);

        int i = 28;
        int j = i % 5;
        System.out.print("val of j is : ");
        System.out.println(j);
        

        // Assignment operators
        int k =5;
        k += 5;
        System.out.print("Val of k is : ");
        System.out.println(k);

        int l = 88;
        l -= 55;
        System.out.print("Val of l is : ");
        System.out.println(l);

        int m = 22;
        m *=3;
        System.out.print("Val of m is : ");
        System.out.println(m);

        int n = 21;
        n /=3;
        System.out.print("Val of n is : ");
        System.out.println(n);


        // Comparison Operators
        int p = 20;
        int q = 5;
        
        System.out.print("the boolean statement is : ");
        System.out.println(p == q);

        System.out.print("the boolean statement is : ");
        System.out.println(p != q);

        System.out.print("the boolean statement is : ");
        System.out.println(p > q);

        System.out.print("the boolean statement is : ");
        System.out.println(p < q);

        System.out.print("the boolean statement is : ");
        System.out.println(p >= q);

        System.out.print("the boolean statement is : ");
        System.out.println(p <= q);


        // Conditional Or Logical Operators
        int r = 55;
        int s = 22; 

        //for && operator -- one condition false... op is false
        System.out.println("the boolean statement for r<s && r>s is : ");
        System.out.println( r<s && r>s );  // should be false since first condition is false

        System.out.println("the boolean statement for r>s && s>r is : ");
        System.out.println(r>s && s>r);   // should be false since second condition is false

        System.out.println("the boolean statement for r>s && s<r is : ");
        System.out.println(r>s && s<r);   // should be true since both conditions are true


        //for || operator -- one condition true... op is true
        System.out.println("the boolean statement for r<s || r>s is : ");
        System.out.println(r<s || r>s);  //should be true since one condition is true

        System.out.println("the boolean statement for r<s || r>s is : ");
        System.out.println(r<s || r>s);  // should be true since one condition is true

        System.out.println("the boolean statement for r<s || s>r is : ");
        System.out.println(r<s || s>r);  // should be false since both conditions are false

    }
}
*/


/* OUTPUT

val of b is : 14
val of d is : 0
val of f is : 49
val of h is : 5
val of j is : 3
Val of k is : 10
Val of l is : 33
Val of m is : 66
Val of n is : 7
the boolean statement is : false
the boolean statement is : true
the boolean statement is : true
the boolean statement is : false
the boolean statement is : true
the boolean statement is : false
the boolean statement for r<s && r>s is :
false
the boolean statement for r>s && s>r is :
false
the boolean statement for r>s && s<r is :
true
the boolean statement for r<s || r>s is :
true
the boolean statement for r<s || r>s is :
true
the boolean statement for r<s || s>r is :
false

*/


/*
int a = 6 * 5 - 34 / 2;

        /*
         using presedence and associativity
         30-17
         //
        System.out.println(a); // 13


        int b = 6 / 5 - 34 * 2;

        /*
         using presedence and associativity
         1-67
         //
        System.out.println(b); // -67


        int c = 4 * 8 + 5 / 2 + 10 * 5 * 3 - 12 + 25;

        /*
         using presedence and associativity
         32 + 2 + 150 - 12 + 25
         //
        System.out.println(c); // 197


        int d = 30 * 8 / 4 + 25 + 70 - 4 * 3 - 20 + 45 * 5;

        /*
         using presedence and associativity
         60 + 25 + 70 - 12 -20 + 225
         //
        System.out.println(d); // 348
        */
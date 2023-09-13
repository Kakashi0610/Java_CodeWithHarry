// Type of EXPRESSIONS   and    INCREMENT / DECREMENT operators -- line 69

//TYPES OF EXPRESSIONS
// agar decimal me number hai... toh saamne koi bhi ho... float aur double he automatically typecasting hogi

// jo bhi biggest data type hai... usme convert hoga

/*
Resulting data type after arithmetic operation

Result = byte + short -> integer
Result = short + integer -> integer
Result = long + float -> float
Result = integer + float -> float
Result = character + integer -> integer
Result = character + short -> integer
Result = long + double -> double
Result = float + double -> double
*/


/*
public class Tut10 
{
    public static void main(String[] args) 
    {
        System.out.println("hello world!");

        int a = 666 + 6;  // int + int
        System.out.print("the value of int + int is : ");
        System.out.println(a);

        float f1 = 2.54f + 3;  // float + int 
        System.out.print("the value of float + int is : ");
        System.out.println(f1); //flaot me hoga

        byte b1 = 3 + 4;  // byte + int
        System.out.print("the value of byte + int is : ");
        System.out.println(b1); // int me hoga
        
        short s = 15 + 5;  // short + int
        System.out.print("the value of short + int is : ");
        System.out.println(s); //  int me hoga

        long l = 15 + 5;  // long + int
        System.out.print("the value of long + int is : ");
        System.out.println(l); // long me hoga

        double d = 22 + 3; // double + int
        System.out.print("the value of double + int is : ");
        System.out.println(d); // double me hoga

        // same for long with double  --> double
        // same for float with double --> double
    }
}
*/


/* OUTPUT
hello world!                                                                                                                                          the value of int + int is : 672
the value of float + int is : 5.54
the value of byte + int is : 7
the value of short + int is : 20
the value of long + int is : 20
*/


// INCREMENT and DECREMENT operators

// 
public class Tut10
{
    public static void main(String[] args) 
    {
        System.out.println("\nINCREMENTING for Integer");
        int i = 7;
        System.out.print("Before incrementing : ");
        System.out.println(i);  // as it is
        System.out.print("After incrementing by i++ : ");
        System.out.println(i++);  // first prints as it is, then increments and stores the value
        System.out.print("After incrementing by ++i : ");
        System.out.println(++i);  // first increments and stores the value, and then prints

        System.out.println("\nDECREMENTING for Integer");
        int j = 22;
        System.out.print("\nBefore decrementing : ");
        System.out.println(j);  // as it is
        System.out.print("After decrementing by j-- : ");  
        System.out.println(j--);  // first prints as it is, then decrements and stores the value
        System.out.print("After decrementing by --j: ");
        System.out.println(--j);  // first dectrements and stores the value, and then prints

        System.out.println("\nINCREMENTING for Float ");
        float f1 = 7.7f;
        System.out.print("Before incrementing : ");
        System.out.println(f1);  // as it is
        System.out.print("After incrementing by f1++ : ");
        System.out.println(f1++);  // first prints as it is, then increments and stores the value
        System.out.print("After incrementing by ++f1 : ");
        System.out.println(++f1);  // first increments and stores the value, and then prints

        System.out.println("\nDECREMENTING for Float");
        float f2 = 7.7f;
        System.out.print("Before incrementing : ");
        System.out.println(f2);  // as it is
        System.out.print("After incrementing by f2-- : ");
        System.out.println(f2--);  // first prints as it is, then increments and stores the value
        System.out.print("After incrementing by --f2 : ");
        System.out.println(--f2);  // first increments and stores the value, and then prints
        
        System.out.println("\nINCREMENTING for Character");
        char char1 = 'f';
        System.out.println("Before incrementing : ");
        System.out.println(char1);
        System.out.println("After incrementing by char1++ : ");
        System.out.println(char1++);
        System.out.println("After incrementing by ++char1 : ");
        System.out.println(++char1);

        System.out.println("\nDECREMENTING for Character");
        char char2 = 'f';
        System.out.println("Before incrementing : ");
        System.out.println(char2);
        System.out.println("After incrementing by char2-- : ");
        System.out.println(char2--);
        System.out.println("After incrementing by --char2 : ");
        System.out.println(--char2);

    }
}
//

/* OUTPUT

INCREMENTING for Integer
Before incrementing : 7
After incrementing by i++ : 7
After incrementing by ++i : 9

DECREMENTING for Integer

Before decrementing : 22
After decrementing by j-- : 22
After decrementing by --j: 20

INCREMENTING for Float
Before incrementing : 7.7
After incrementing by f1++ : 7.7
After incrementing by ++f1 : 9.7

DECREMENTING for Float
Before incrementing : 7.7
After incrementing by f2-- : 7.7
After incrementing by --f2 : 5.7

INCREMENTING for Character
Before incrementing :
f
After incrementing by char1++ :
f
After incrementing by ++char1 :
h

DECREMENTING for Character
Before incrementing :
f
After incrementing by char2-- : 
f
After incrementing by --char2 :
d

*/

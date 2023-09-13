/* LITERALS in JAVA

LITERALS  -- are the values defined to the variables with a keyword of the datatype defined

byte age = 30;   // 30 is int literal value
float float1 = 55.77f;  // 55.77f is float literal value

long, int, short, byte falls under Integer values

byte, short, int DOESNT require b, s, i... keywords in the values defined

long is for BIGGER INTEGER value
long requires l or L in the literal values or will throw error

float is for SMALLER DECIMAL value whereas double is for BIGGER DECIMAL values 
float requires f or F and   double requires d or D in the literal values or will throw error

String keyword REQUIRES a capital S in String keyword itself (not in the literal value)

*/


//
public class Tut4 
{
    public static void main(String[] args) 
    {
        byte age = 30;   // 30 is int literal value
        System.out.print("\nthe values of byte is : ");
        System.out.println(age);

        char ch = 'a';
        System.out.print("the values of char is : ");
        System.out.println(ch);

        // F or f to declare the float literal
        float float1 = 55.77f;
        float float2 = 55.77F;
        System.out.println("the values of Float are : ");
        System.out.println(float1);
        System.out.println(float2);

        // D or d to declare the double literal
        double double1 = 55.77d;
        double double2 = 55.77D;
        System.out.println("\nthe values of Double are : ");
        System.out.println(double1);
        System.out.println(double2);

        // D or d to declare the double literal
        long long1 = 556757567677l;
        long long2 = 556757567677L;
        System.out.println("\nthe values of Long are : ");
        System.out.println(long1);
        System.out.println(long2);

        String str1 = "\nhello this is a string !!";
        System.out.println(str1);
    }
}
//


/* OUTPUT
the values of byte is : 30
the values of char is : a
the values of Float are :
55.77
55.77

the values of Double are :
55.77
55.77

the values of Long are :
556757567677
556757567677

hello this is a string !!
*/
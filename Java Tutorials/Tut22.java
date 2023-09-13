// DO WHILE LOOP


/*
Main difference between for and while is
FOR LOOP is used when the user wants to purposely end the program and run it till he requires the result.
WHILE LOOP is used when the user doesnt know when the condition satisfies.

example:

FOR loop will be used when there will be 10 packets of rice to be emptied, and the user will be knowing 
the limit of the total number of packets.

Whereas,

WHILE loop will be used when there will be n number of packets of rice to be emptied, and he doesnt know 
the limit of the total packets of the rice.
*/


//
import java.util.Scanner;

public class Tut22  
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scan1.nextInt();
        System.out.printf("The entered number is : %d\n\n",num);

        int i = 1;
        int value ;
        System.out.println("printing Multiplication table using do while : ");

        do
        {
            value = num * i;
            System.out.printf("%d * %d = %d\n",num,i,value);
            i++;
        }
        while (i < 11);
        scan1.close();
    }
}
//



/* OUTPUT

Enter the number : 
55
The entered number is : 55

printing Multiplication table using do while :
55 * 1 = 55
55 * 2 = 110
55 * 3 = 165
55 * 4 = 220
55 * 5 = 275
55 * 6 = 330
55 * 7 = 385
55 * 8 = 440
55 * 9 = 495
55 * 10 = 550

*/

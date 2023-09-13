// STRINGS in JAVA

// original strings cannot be altered in any case, methods are only used to pass a modified copy of 
// the original string according to requirement


/*
Method	Description
1. length()	Returns the length of String name. (5 in this case)

2. toLowerCase()	Converts all the characters of the string to the lower case letters.

3. toUpperCase()	Converts all the characters of the string to the upper case letters.

4. trim()	Returns a new String after removing all the leading and trailing spaces from the original 
   string.

5. substring(int start)	
Returns a substring from start to the end. Substring(3) returns “ry”. [Note that indexing starts from 0]

6. substring(int start, int end)	Returns a substring from the start index to the end index. The start 
   index is included, and the end is excluded.

7. replace(‘r’, ‘p’)	Returns a new string after replacing r with p. Happy is returned in this case. 
   (This method takes char as argument)

8. startsWith(“Ha”)	Returns true if the name starts with the string “Ha”. (True in this case)

9. endsWith(“ry”)	Returns true if the name ends with the string “ry”. (True in this case)

10. charAt(2)	Returns the character at a given index position. (r in this case)

11. indexOf(“s”)	Returns the index of the first occurrence of the specified character in the given string.

12. lastIndexOf(“r”)	Returns the last index of the specified character from the given string. (3 in this 
    case)

13. equals(“Harry”)	Returns true if the given string is equal to “Harry” false otherwise [Case sensitive]

14.equalsIgnoreCase(“harry”)	Returns true if two strings are equal, ignoring the case of characters.
*/


/*  ALL STRING METHODS

public class Tut14 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello world!");
        String str1 = new String();
        str1 = "Aniket is Kakashi";

        //System.out.println(str1);
        System.out.printf("The string in str1 is : %s\n\n", str1);



        // For length of string
        int length_of_str = str1.length();
        System.out.printf("The length of the string using length() is : %d\n\n", length_of_str);
        //will start from 1 to n



        // To convert string to lowercase
        String lowercase_str1 = str1.toLowerCase();
        System.out.printf("The string converted to lowercase using toLowerCase() is : %s\n\n",lowercase_str1);  
        


        // To convert string to uppercase
        String uppercase_str1 = str1.toUpperCase();
        System.out.printf("The string converted to uppercase using toUpperCase() is : %s\n\n",uppercase_str1);



        // To trim the spaces behind and ahead of the strings
        String untrimmed_string = "    Aniket is Kakashi    ";

        System.out.printf("the untrimmed string is : %s\n", untrimmed_string);
        System.out.printf("the untrimmed string using trim() is : %s\n\n", untrimmed_string.trim());



        // Mostly use this method
        // To print the string from certain index number till certain index
        String str3 = str1.substring(0,17);
        System.out.printf("The string starts from beginIndex to endIndex: %s\n\n", str3);



        // To print the string from certain index number till the end of string
        String str2 = (str1.substring(5));  // starts with 0
        System.out.printf("The string starts from beginIndex till its null: %s\n\n", str2);



        // To replace a character from the string (temporary)
        String str4 = str1.replace('i', '*');
        System.out.printf("The replaced char is displayed as : %s\n\n",str4);

        String str9 = str1.replace("Aniket", "Obito");
        System.out.printf("The replaced string is displayed as : %s\n\n",str9);



        // To check if the string is starting with the same prefix
        boolean str5 = str1.startsWith("Ani");
        System.out.printf("Does the String str1 start with the given prefix : %s\n\n",str5);

        boolean str7 = str1.startsWith("wverge");   // unknown string ( random : state)
        System.out.printf("Does the String str1 start with the given prefix : %s\n\n",str7);



        // To check if the given string ends with the given suffix 
        boolean str6 = str1.endsWith("shi");
        System.out.printf("Does the String str1 ends with the given suffix : %s\n\n",str6);

        boolean str8 = str1.endsWith("sfrsi");
        System.out.printf("Does the String str1 ends with the given suffix : %s\n\n",str8);



        // To see the character at the number of index value  -- starts from 0
        System.out.printf("The character at requested index is : %s\n\n",str1.charAt(12));
        System.out.printf("The character at requested index is : %s\n\n",str1.charAt(7));
        System.out.printf("The character at requested index is : %s\n\n",str1.charAt(4));

        // To check the index value of the desired string/character
        int str10 = str1.indexOf("is");
        System.out.printf("The index of the desired string/char is : %d\n\n",str10);



        // To check the index value of the desired string/character from the desired Index
        String strrr = "Aniket Shinde loves to play Volleyball";
        System.out.print("The required index of the character from desired index is : ");
        System.out.println(strrr.indexOf("lley", 5));
        System.out.printf("The length of string strrr is : %d\n\n",strrr.length());

        System.out.print("The required index of the character from desired index is : ");
        System.out.println(strrr.indexOf("srfdrger", 1));



        // to show the last position of the character/string from original string
        // lastindexof starts from the end of the string
        System.out.print("The last position of the character from string is : ");
        System.out.println(strrr.lastIndexOf('a'));

        // it'll search from the end of the string to index 33, and will display last index from the start of string till 33
        System.out.println(strrr.lastIndexOf('a', 33));



        // Used to return boolean value true if the string is equal to the string in str1.equals()
        // Doesnt ignore the upper and lower cases of the strings that are equal
        Boolean str13 = str1.equals("Aniket is Kakashi");
        System.out.printf("Is the following str13 equal to the original string ? : %s\n\n", str13);

        Boolean str14 = str1.equals("wnfiowuerncieo");
        System.out.printf("Is the following str14 equal to the original string ? : %s\n\n", str14);

        Boolean str15 = str1.equals("aniket is kakashi");
        System.out.printf("Is the following str15 equal to the original string ? : %s\n\n", str15);

        

        // equalsIgnoreCase() is used to ignore the upper and the lower cases of the string that are equal
        Boolean str16 = str1.equalsIgnoreCase("AnIkeT is kAkaShi");
        System.out.printf("Is the following str16 equal to the original string ? : %s\n\n", str16);



        // original string will remain unchanged
        System.out.printf("The original string remains same : ",str1);  



        // only way string can be changed is, if we redefine it using methods
        str1 = str1.toLowerCase(); 
        System.out.print("Only way string can be changed is, if we redefine it using methods : ");
        System.out.println(str1);

        str1 = str1.replace("a", "@");
        System.out.printf("The string str1 is : %s\n\n", str1);

    }
}
*/


/*
Hello world!
The string in str1 is : Aniket is Kakashi

The length of the string using length() is : 17

The string converted to lowercase using toLowerCase() is : aniket is kakashi

The string converted to uppercase using toUpperCase() is : ANIKET IS KAKASHI

the untrimmed string is :     Aniket is Kakashi
the untrimmed string using trim() is : Aniket is Kakashi

The string starts from beginIndex to endIndex: Aniket is Kakashi

The string starts from beginIndex till its null: t is Kakashi

The replaced char is displayed as : An*ket *s Kakash*

The replaced string is displayed as : Obito is Kakashi

Does the String str1 start with the given prefix : true

Does the String str1 start with the given prefix : false

Does the String str1 ends with the given suffix : true

Does the String str1 ends with the given suffix : false

The character at requested index is : k

The character at requested index is : i

The character at requested index is : e

The index of the desired string/char is : 7

The required index of the character from desired index is : 30
The length of string strrr is : 38

The required index of the character from desired index is : -1
The last position of the character from string is : 35
25
Is the following str13 equal to the original string ? : true

Is the following str14 equal to the original string ? : false

Is the following str15 equal to the original string ? : false

Is the following str16 equal to the original string ? : true

The original string remains same : Only way string can be changed is, if we redefine it using methods : aniket is kakashi
The string str1 is : @niket is k@k@shi

*/
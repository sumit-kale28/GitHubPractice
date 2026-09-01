package javaprogrammingstring;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SProgram1 {
    public static void main() {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Your Full name: ");
        String Name = Sc.nextLine();
        System.out.println("Your Last name: ");
        String Last_Name = Sc.nextLine();
        Str_length(Name);
        Str_ToUpper(Name);
        Str_ToLower(Name);
        Str_trim(Name);
        Str_CharAt(Name);
        Str_indexOf(Name);
        Str_LastindexOf(Name);
        Str_concat(Name, Last_Name);
        Str_Compare(Name, Last_Name);
        Str_CompareIgn(Name, Last_Name);
        Str_CompareOper(Name, Last_Name);

        //startswith() //replaceAll()
        Str_startwith(Name, Last_Name);

        //endswith() //replaceAll()
        Str_endswith(Name, Last_Name);

        //replace()
        Str_Replace(Name);

        //replacefirst()
        Str_ReplaceFirst(Name);

        //compareTo()
        Str_CompareTo(Name);
        //compareToIgnorecase()
        Str_CompareToIgn(Name);

        //Substring()
        Str_SubString(Name);
        //Substring(Include,Exclude)
        //subSequence()
        //Split()
        //tocharArray()

    }


    public static void Str_length(String Name)
    {
        int length=Name.length();
        System.out.println("Length of String: "+length);
    }
    public static void Str_ToUpper(String Name) {
        String Ustr = Name.toUpperCase();
        System.out.println("To Upper String: "+Ustr);
    }
    public static void Str_ToLower(String Name) {
        String Lstr = Name.toLowerCase();
        System.out.println("To Lower Case: "+Lstr);
    }
    public static void Str_trim(String Name) {
        String T_str = Name.trim();
        System.out.println("Trimed String: "+T_str);
    }
    public static void Str_CharAt(String Name) {
        char index= Name.charAt(2);
        System.out.println("Index of Character: "+index);
    }

    public static void Str_indexOf(String Name)
    {
        int indexof= Name.indexOf('S');
        System.out.println("First Index of Character S: "+indexof);
    }

    public static void Str_LastindexOf(String Name)
    {
        int Lastindexof= Name.lastIndexOf('a');
        System.out.println("Last Index of Character a: "+Lastindexof);
    }

    public static void Str_concat(String Name, String Lastname)
    {
        String concat=  Name.concat(Lastname);
        System.out.println("Result of concat() function: "+concat);
        System.out.println("Result of Concat of Two string using + Operator: "+ Name+" "+Lastname);
    }

    public static void Str_Compare(String Name, String Lastname)
    {
     if(Name.equals(Lastname))
     {
         System.out.println("String Equals");
     }
     else{
         System.out.println("String are not equals");
     }
    }

    public static void Str_CompareIgn(String Name, String Lastname)
    {
        if(Name.equalsIgnoreCase(Lastname))
        {
            System.out.println("String Equals");
        }
        else{
            System.out.println("String are not equals");
        }
    }

    public static void Str_CompareOper(String Name, String Lastname)
    {
        if(Name==Lastname)
        {
            System.out.println("String Equals");
        }
        else{
            System.out.println("String are not equals");
        }
    }

    public static void Str_startwith(String Name, String Lastname)
    {
        if(Name.startsWith(Lastname)) {
            System.out.println("First Name Start With Last name" );
        }
        else {
            String S=Name.replaceAll(Name,Lastname);
            System.out.println("Replaced name with Last Name: "+ S);
        }
    }

    public static void Str_endswith(String Name, String Lastname)
    {
        if(Name.startsWith(Lastname)) {
            System.out.println("First Name Start With Last name" );
        }
        else {
            String S=Name.replaceAll(Name,Lastname);
            System.out.println("Replaced name with Last Name: "+ S);
        }
    }

    public static void Str_Replace(String Name)
    {
        String replace= Name.replace('u','U');
    }

    public static void Str_ReplaceFirst(String Name)
    {
        String replace= Name.replaceFirst("Sumit", "MARVELOUS");
        System.out.println("Replace First result: "+ replace);
    }

    public static void Str_CompareTo(String Name)
    {
        int compare_result= Name.compareTo("SUMIT");
        System.out.println("String Comparision Result: "+compare_result);
    }
    public static void Str_CompareToIgn(String Name)
    {
        int compare_result=Name.compareToIgnoreCase("SUMIT");
        System.out.println("String Comparision Result: "+compare_result);
    }

    public static void Str_SubString(String Name)
    {
        String Sub=Name.substring(3);
        System.out.println("Sub String with Start Point: "+ Sub);
        String Sub1=Name.substring(3,10);
        System.out.println("Sub String with Start & End Point: "+Sub1);
        CharSequence Sub2=Name.subSequence(3,10);
        System.out.println("Sub String using CharSequence Data Type: "+Sub2);

    }
}

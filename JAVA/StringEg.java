import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class StringEg {
    public static void main(String[] args) {
        // PRINT STRING:
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter String1");
        // String name1 = sc.next();
        // System.out.println(name1);
        // sc.nextLine();
        // System.out.print("Enter the string2:");
        // String name2=sc.nextLine();
        // System.out.println(name2);


        // FING LENGTH:
        //  Scanner sc = new Scanner(System.in);
        // System.out.print("Enter String1");
        // String name1 = sc.next();
        // System.out.println(name1);
        // int a=name1.length();
        // System.out.println(a);
        // sc.nextLine();
        // System.out.print("Enter the string2:");
        // String name2=sc.nextLine();
        // System.out.println(name2);
        // int b=name2.length();
        // System.out.println(b);


        // PRINT EACH CHARACTER IN STRING:
        //  Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the string:");
        // String name2=sc.nextLine();
        // System.out.println(name2);
        // int b=name2.length();
        // System.out.println(b);
        // for(int i=0;i<=b-1;i++){
        //     System.out.println(name2.charAt(i));
        // }



        // COMPARE TWO STRING:
        //  Scanner sc = new Scanner(System.in);
        // System.out.print("Enter String1");
        // String name1 = sc.next();
        // System.out.println(name1);
        
        // sc.nextLine();
        // System.out.print("Enter the string2:");
        // String name2=sc.nextLine();
        // System.out.println(name2);

        // System.out.println(name1.equals(name2));


        // COUNT VOWELS:
    //    Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter string:");
    //     String str = sc.nextLine();
    //     int count = 0;
    //     for(int i = 0; i < str.length(); i++) {
    //         char ch = str.charAt(i);
    //         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
    //            ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
    //             count++;
    //         }
    //     }
    //     System.out.println(count);
        

    // FIND NUMBER OF DIGITE IN THE STRING:
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a string:");
    // String str = sc.nextLine();
    // int count = 0;
    // for(int i = 0; i < str.length(); i++) {
    //     char ch = str.charAt(i);
    //     if(Character.isDigit(ch)) {
    //         count++;
    //     }
    // }
    // System.out.println("Number of digits = " + count);
    

    // UPPERCASE AND LOWERCASE AND NUMBER OF DIGITE IN THE STRING COUNT:
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string:");
        // String str = sc.nextLine();
        // int upper = 0, lower = 0, digit = 0;
        // for(int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if(Character.isUpperCase(ch))
        //         upper++;
        //     else if(Character.isLowerCase(ch))
        //         lower++;
        //     else if(Character.isDigit(ch))
        //         digit++;
        // }
        // System.out.println("Uppercase Count = " + upper);
        // System.out.println("Lowercase Count = " + lower);
        // System.out.println("Digit Count = " + digit);



        // STRING REVERSE
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string:");
        // String str = sc.nextLine();
        // for(int i = str.length() - 1; i >= 0; i--) {
        //     System.out.print(str.charAt(i));
        // }



        // LETTER FREQUENCE
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string:");
        // String str = sc.nextLine();
        // int count=0;
        // for(int i=0;i<str.length();i++){
        //     char c=str.charAt(i);
        //     if(c=='b'){
        //         count++;
        //     }
        // }
        // System.out.print("Total Frquency Of b:"+count);

        
        // PALINDROM STRING:
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string:");
        // String str = sc.nextLine();
        // String rev = "";
        // for(int i = str.length() - 1; i >= 0; i--) {
        //     rev = rev + str.charAt(i);
        // }
        // if(str.equals(rev))
        //     System.out.println("Palindrome");
        // else
        //     System.out.println("Not Palindrome");


        // String s1="LOVE";
        // String s2="LOVE";
        // if(s1.length()==s2.length() && (s1+s1).contains(s2)){
        //     System.out.println("Rotation");
        // }
        // else{
        //     System.out.println("Not a Rotation");
        // }


        // String s="420143";
        // for(int i=s.length()-1;i>=0;i--){
        //     int digit = s.charAt(i)-'0';
        //     if(digit % 2!=0){
        //         System.out.println(s.substring(0,i+1));
        //         return;
        //     }
        // }
        // System.out.println("");


        // String s1="Thalapathy CM";
        // String s2="NO Trishaa Only Sangeetha";
        String s1="race";
        String s2="care";
        char[]a=s1.toCharArray();
        char[]b=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a, b)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

    }
}

        
    
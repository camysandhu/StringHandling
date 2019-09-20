import java.util.Locale;
import java.util.Scanner;

public class StringHandling {


    public static void main(String[] args)
    {
        /*String s1 ="Hello";
        String s2 ="Hello";
        String s3=null;
        String s4=new String("Hello World");
        if (s1==s2)
        {
            System.out.println("s1=s2");
        }
        else
        {
            System.out.println(s1!=s2);
        }
        if(s3==s2)
        {
            System.out.println("s3=s2");
        }
        else
        {
            System.out.println("s3!=s2");
        }
        if(s1 ==s4)
        {
            System.out.println("s1=s4");
        }
        else
        {
            System.out.println("s1!=s4");
        }
*/
       /* String s1="Hello";
        System.out.println(s1);

       s1= s1.toLowerCase();
        System.out.println(s1);

       s1= s1.toUpperCase();
        System.out.println(s1);
        */
       String collegeName = "Lambton College in Toronto";

       /*collegeName = String.valueOf(collegeName.length());
       System.out.println(collegeName);*/

       Boolean b =collegeName.contains("College");
       System.out.println(b);


       /*nt a[]= {1,2,3,4,5};

       int b[]= new int[]{6,7,8,9,10};

       int c[]=new int[10];

        int c[];
        */

        char c[] = collegeName.toCharArray();
        char rev[]=new char[c.length];
        int cnt=0;
        for(int i=c.length-1;i >=0; i--)
        {
            rev[cnt++]=c[i];



        }
        String reverseString= new String(rev);
        System.out.println("Reverse String = " + reverseString);


    }



}

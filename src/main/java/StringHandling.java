import java.util.Locale;
import java.util.Scanner;

public class StringHandling {


    public static void main(String[] args)
    {


         String s =String.format("%d $s $s", 10, "hello","world");
        System.out.println(s);

        System.out.print("Enter College name: ");
        Scanner scanner = new Scanner(System. in);
        String inputString = scanner. nextLine();
        System.out.println("String read from console is : \n"+inputString);




       /* *//*String s1 ="Hello";
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
*//*
       *//* String s1="Hello";
        System.out.println(s1);

       s1= s1.toLowerCase();
        System.out.println(s1);

       s1= s1.toUpperCase();
        System.out.println(s1);
        *//*
       String collegeName = "Lambton College in Toronto";

       *//*collegeName = String.valueOf(collegeName.length());
       System.out.println(collegeName);*//*

      *//* Boolean b =collegeName.contains("College");
       System.out.println(b);*//*


       *//*nt a[]= {1,2,3,4,5};

       int b[]= new int[]{6,7,8,9,10};

       int c[]=new int[10];

        int c[];
        *//*

        *//*char c[] = collegeName.toCharArray();
        char rev[]=new char[c.length];
        int cnt=0;
        for(int i=c.length-1;i >=0; i--)
        {
            rev[cnt++]=c[i];
        }

        String reverseString= new String(rev);
        System.out.println("Reverse String = " + reverseString);*//*

        String []strings= collegeName.split("");
        StringBuffer stringbuffer = new StringBuffer();
        for(int i= 1; i < strings.length;i++)
        {
            String rev = strings[i];
            if(i%2 ==1)
            {
                rev = reverse(rev);
            }
            stringbuffer.append(rev);
            stringbuffer.append(" ");
        }
        System.out.println("args =" + stringbuffer.toString());




    }

    private static String reverse(String str) {

        if(str == null)
        {
            return new String();
        }
        char c[] = str.toCharArray();
        char rev[]=new char[c.length];
        int cnt=0;
        for(int i=c.length-1;i >=0; i--)
        {
            rev[cnt++]=c[i];
        }
        return new String(rev);*/
    }


}

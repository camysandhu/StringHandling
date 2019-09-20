public class StringHandling {


    public static void main(String[] args)
    {
        String s1 ="Hello";
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


    }
}

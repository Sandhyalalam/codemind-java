import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int s1,s2,s3,s4;
        Scanner read=new Scanner(System.in);
        s1=read.nextInt();
        s2=read.nextInt();
        s3=read.nextInt();
        if(s1+s2>s3 && s1+s3>s2 && s2+s3>s1)
        {
            System.out.println("Valid triangle");
        }
        else
        {
            System.out.println("Invalid triangle");
        }
    }
}
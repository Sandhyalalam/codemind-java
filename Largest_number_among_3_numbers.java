import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        c=read.nextInt();
        if(a>b && a>c)
        {
            System.out.printf("%d",a);
        }
        else if(b>a && b>c)
        {
            System.out.printf("%d",b);
        }
        else
        {
            System.out.printf("%d",c);
        }
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        c=read.nextInt();
        if(a==b && b==c)
        {
            System.out.println("Equilateral triangle");
        }
        else if(a==b || a==c || b==c )
        {
            System.out.printf("Isosceles triangle");
        }
        else
        {
            System.out.println("Scalene triangle");
        }
    }
}
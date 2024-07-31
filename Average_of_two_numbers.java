import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        double c;
        c=(a+b)/2.0;
        System.out.printf("Average of %d and %d is: %.2f",a,b,c);
    }
}
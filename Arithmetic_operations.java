import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int a,b;
        Scanner read = new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        int sum=a+b;
        int diff=a-b;
        int pro=a*b;
        int quo=a/b;
        int rem=a%b;
        System.out.printf("Sum:%d
Difference:%d
Product:%d
Quotient:%d
Remainder:%d",sum,diff,pro,quo,rem);
    }
}
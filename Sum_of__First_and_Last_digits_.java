import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int i,n,d;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        d=n%10;
        while(n>10)
        n=n/10;
        d=d+n;
        System.out.println(d);
    }
}
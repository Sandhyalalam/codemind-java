import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int n,i,a,b;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        a=read.nextInt();
        b=read.nextInt();
        for(i=a;i<=b;i=i+1)
        System.out.printf("%d x %d = %d
",n,i,n*i);
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int i,a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        for(i=1;i<=b;i=i+1)
        System.out.printf("%d x %d = %d
",a,i,a*i);
    }
}
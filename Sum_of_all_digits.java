import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int r,n,sum=0;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println(sum);
    }
}
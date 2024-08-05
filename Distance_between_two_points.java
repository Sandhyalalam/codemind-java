import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int x1,x2,y1,y2;
        Scanner read=new Scanner(System.in);
        x1=read.nextInt();
        x2=read.nextInt();
        y1=read.nextInt();
        y2=read.nextInt();
        int a=(x2-y2);
        int b=(x1-y1);
        double res=Math.sqrt(a*a+b*b);
        System.out.printf("%.4f",res);
        
        
    }
}
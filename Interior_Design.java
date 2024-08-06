import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int x1,y1,x2,y2;
        Scanner read=new Scanner(System.in);
        x1=read.nextInt();
        y1=read.nextInt();
        x2=read.nextInt();
        y2=read.nextInt();
        int a=x1+y1;
        int b=x2+y2;
        if(a<b)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
        
        
    }
}
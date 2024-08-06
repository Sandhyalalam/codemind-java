import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int x,y;
        Scanner read=new Scanner(System.in);
        x=read.nextInt();
        y=read.nextInt();
        if(2*y<=x)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
    }
}
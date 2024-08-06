import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int x;
        Scanner read=new Scanner(System.in);
        x=read.nextInt();
        if(x<3)
        {
            System.out.printf("LIGHT");
        }
        else if(x>=3 && x<7)
        {
            System.out.println("MODERATE");
        }
        else
        {
            System.out.printf("HEAVY");
        }
    }
}
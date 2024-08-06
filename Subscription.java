import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int x;
        Scanner read=new Scanner(System.in);
        x=read.nextInt();
        if(x>40)
        {
            System.out.printf("YES");
        }
       
        else
        {
            System.out.printf("NO");
        }
    }
}
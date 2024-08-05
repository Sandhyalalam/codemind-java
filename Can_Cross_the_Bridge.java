import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int x,y,z;
        Scanner read=new Scanner(System.in);
        x=read.nextInt();
        y=read.nextInt();
        z=read.nextInt();
        int res=(z-y)/x;
        System.out.println(res);
        
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int x,y,z;
        Scanner read=new Scanner(System.in);
        x=read.nextInt();
        y=read.nextInt();
        z=read.nextInt();
        int res=(5*x+10*y)/z;
        System.out.println(res);
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int h,m;
        Scanner read= new Scanner(System.in);
        m=read.nextInt();
        h=m/60;
        m=m%60;
        System.out.printf("%d Hour(s) %d Minute(s)",h,m);
    }
}
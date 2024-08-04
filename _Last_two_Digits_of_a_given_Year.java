import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int y;
        Scanner read = new Scanner(System.in);
        y=read.nextInt();
        int res=y%100;
        System.out.printf("%02d",res);
    }
}
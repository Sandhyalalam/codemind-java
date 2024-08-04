import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
    int s;
    Scanner read= new Scanner(System.in);
    s=read.nextInt();
    int sa=6*s*s;
    int v=s*s*s;
    System.out.printf("Surface area = %d and Volume = %d",sa,v);
}
}
import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int n;
        Scanner read = new Scanner(System.in);
        n=read.nextInt();
        int res=(n*(n+1)/2);
        System.out.println(res);
        
    }
}
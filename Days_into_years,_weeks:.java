import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int d;
        Scanner read = new Scanner(System.in);
        d=read.nextInt();
        int years=(d/365);
        int weeks=(d%365)/7;
        System.out.printf("%d
%d
",years,weeks);
    }
}
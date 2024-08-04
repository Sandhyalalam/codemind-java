import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int b,h;
        Scanner read=new Scanner(System.in);
        b=read.nextInt();
        h=read.nextInt();
        int res=(b*h)/2;
        System.out.println(res);
    }
}
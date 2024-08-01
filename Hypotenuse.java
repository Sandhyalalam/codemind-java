import java.util.Scanner;
    public class Main{
        public static void main(String[] args)
        {
            int a,b;
            Scanner read=new Scanner(System.in);
            a=read.nextInt();
            b=read.nextInt();
            double c=Math.sqrt((a*a)+(b*b));
            System.out.printf("%.2f",c);
        }
    }


import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int n,count=0;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    int p,r,t;
    Scanner read= new Scanner(System.in);
    p=read.nextInt();
    r=read.nextInt();
    t=read.nextInt();
    double ci=p*Math.pow((1+r/100.0),t)-p;
    System.out.printf("%.2f",ci);
    
} 
}
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Double Salary,HRA,DA,PF,GS;
        Scanner read = new Scanner(System.in);
        Salary = read.nextDouble();
        HRA = read.nextDouble();
        DA=read.nextDouble();
        PF=(12/100.0)*Salary;
         GS = Salary + HRA + DA + PF;
        System.out.printf("%.2f
%.2f",PF,GS);
    }
}
import java.lang.Math;
import java.util.*;

public class lab1b{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter P: ");
        double P = sc.nextDouble();
        System.out.print("Enter R: ");
        double R = sc.nextDouble();
        System.out.print("Enter T: ");
        double T = sc.nextDouble();
        System.out.print("Enter n: ");
        double n = sc.nextDouble();
        
        double si,ci;

        si = (P*R*T)/100;
        double a = Math.pow((1+R/(100*n)), (n*T));
        
        ci = (P*a) - P;
        
        System.out.println("Simple interest: " + si);
        System.out.println("Compound Interest: " + ci);
        sc.close();
    }
}

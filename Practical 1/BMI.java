import java.util.*;
public class lab1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight: ");
        float w = sc.nextFloat();

        System.out.println("Enter height: ");
        float h = sc.nextFloat();

        float bmi = w/(h*h);
        System.out.println("Body Mass Index = " + bmi);
        sc.close();
    }
}

package Engine;     // Package name and folder name should be same

import java.util.*;

public class make_engine {          // File name and class name should be same
    public void msg1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter engine no: ");
        int eng_no = sc.nextInt();
        System.out.print("Enter engine cost: ");
        double eng_cost = sc.nextDouble();

        System.out.println("Output- ");
        System.out.println("Engine no: " + eng_no);
        System.out.println("Engine cost: " + eng_cost);
        sc.close();
    }
}

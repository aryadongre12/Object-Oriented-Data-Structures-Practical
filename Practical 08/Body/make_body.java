package Body;     // Package name and folder name should be same

import java.util.Scanner;

public class make_body{          // File name and class name should be same
    public void msg2(){
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter body material: ");
        String bd_mat = s.nextLine();
        System.out.print("Enter body cost: ");
        double bd_cost = s.nextDouble();

        System.out.println("Output- ");
        System.out.println("Body material: " + bd_mat);
        System.out.println("Body cost: " + bd_cost);
        s.close();
    }
}

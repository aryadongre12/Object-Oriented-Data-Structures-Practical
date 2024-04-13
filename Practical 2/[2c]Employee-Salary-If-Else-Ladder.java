import java.util.*;

public class lab2c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        int x = sc.nextInt();
      
        if(x >= 90000){
            System.out.println("Class I");
        }
        else if(x >= 60000 && x < 90000){
            System.out.println("Class II");
        }
        else if(x >= 50000 && x < 60000){
            System.out.println("Class III");
        }
        else if(x >= 30000 && x < 50000){
            System.out.println("Class IV");
        }
        else if(x < 30000){
            System.out.println("Class V");
        }
        sc.close();
    }
}

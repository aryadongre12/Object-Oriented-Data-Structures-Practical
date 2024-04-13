import java.util.*;

public class lab3 {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.getdata();

        System.out.println();
        System.out.println("Output data is- ");
        v.displaydata(); 
    }
}

class vehicle{
    int v_no, price, year, S_no;
    String V_name, ftype; 

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle name: ");
        V_name = sc.nextLine();
        System.out.print("Enter fuel type: ");
        ftype = sc.nextLine();
        System.out.print("Enter vehicle number: ");
        v_no = sc.nextInt();
        System.out.print("Enter Price: ");
        price = sc.nextInt();
        System.out.print("Enter year: ");
        year = sc.nextInt();
        System.out.print("Enter seat type: ");
        S_no = sc.nextInt();
        sc.close();
    }

    void displaydata(){
        System.out.println("Vehicle Number: " + v_no);
        System.out.println("Price: " + price);
        System.out.println("Year: " + year);
        System.out.println("Seat type: " + S_no);
        System.out.println("Vehicle name: " + V_name);
        System.out.println("Fuel type: " + ftype);
    }
}

import java.util.*;

public class lab2a {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int x = (a>b)?a:b;
        int largest = (x>c)?x:c;
        System.out.println("Largest number is: " + largest);

        int y = (a<b)?a:b;
        int smallest = (y<c)?y:c;
        System.out.println("Smallest number is: " + smallest);
        sc.close();
    }
}

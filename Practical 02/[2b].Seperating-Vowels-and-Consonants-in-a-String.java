import java.util.*;

public class lab2b{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        int vow = 0, con = 0, dig = 0, sp = 0;

        for(int i=0; i<input.length(); i++){
            char x = input.charAt(i);
            if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
                vow++;
            }
            else if (Character.isLetter(x)){
                con++;
            } 
            else if (Character.isDigit(x)){
                dig++;
            } 
            else{
                sp++;
            }
        }

        System.out.println("Vowels are: " + vow);
        System.out.println("Consonents are: " + con);
        System.out.println("Digits are: " + dig);
        System.out.println("Special Characters are: " + sp);
        sc.close();
    } 
}

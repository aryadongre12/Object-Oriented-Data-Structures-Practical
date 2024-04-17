public class lab4b {
    public static void main(String[] args) {
        methoverload m = new methoverload();
      
        System.out.println("Square: " + m.calc(4));
        System.out.println("Cube: " + m.calc(3.2));
    }
}

class methoverload{
    int calc(int a){
        return a*a;
    }

    double calc(double b){
        return b*b*b;
    }
}

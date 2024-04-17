public class lab4a {
    public static void main(String[] args) {
        System.out.print("1st Complex No: ");
        cn c1 = new cn(6,5);
        c1.display();

        System.out.print("2nd Complex No: ");
        cn c2 = new cn(3,2);
        c2.display();
        System.out.println();

        operations(c1,c2);
    }

    public static void operations(cn c1, cn c2){
        cn res = new cn(0, 0);

        System.out.print("Addition: ");
        res.r = c1.r + c2.r;
        res.im = c1.im + c2.im;
        res.display();
        
        System.out.print("Subtraction: ");
        res.r = c1.r - c2.r;
        res.im = c1.im - c2.im;
        res.display();

        System.out.print("Multiplication: ");
        res.r = (c1.r * c2.r) - (c1.im * c2.im);
        res.im = (c1.r * c2.im) + (c1.im * c2.r);
        res.display();

        System.out.print("Division: ");
        double denominator = (c2.r * c2.r) + (c2.im * c2.im);
        res.r = ((c1.r * c2.r) + (c1.im * c2.im)) / denominator;
        res.im = ((c1.im * c2.r) - (c1.r * c2.im)) / denominator;
        res.display();
    }
}

class cn{
    double r, im;
    public cn(double real, double img){
        r = real;
        im = img;
    }
    
    public void display(){
        System.out.println(r + " + j" + im);
    }
}

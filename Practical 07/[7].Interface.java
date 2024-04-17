interface Language{
    public void getname();
    public void getversion();
}

class prolang implements Language{
    String n;
    double v;

    prolang(String name, double version){
        this.n = name;
        this.v = version;
    }

    public void getname(){
        System.out.println("Name is: " + n);
    }
    
    public void getversion(){
        System.out.println("Version is: " + v);
    }
}

public class lab7{
    public static void main(String[] args){
        prolang L1 = new prolang("Java", 7.2);
        prolang L2 = new prolang("C++", 5.8);
        prolang L3 = new prolang("Python", 8.0);

        System.out.println("Language 1 - ");
        L1.getname();
        L1.getversion();
      
        System.out.println("\nLanguage 2 - ");
        L2.getname();
        L2.getversion();
      
        System.out.println("\nLanguage 3 - ");
        L3.getname();
        L3.getversion();
    }
}

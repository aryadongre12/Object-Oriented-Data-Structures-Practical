public class lab5{
    public static void main(String[] args) {
        officer o = new officer();
        clerk c = new clerk();
        regular r = new regular();
        adhoc a = new adhoc();
        peon p = new peon();
        
        System.out.println("Salary: " + r.salary);
        System.out.println("Peon name: " + r.p_name);
        System.out.println("Peon work type: " + a.w_type);
        System.out.println("Officer name: " + o.o_name);
        System.out.println("Officer class: " + o.o_class);
        System.out.println("Officer area: " + o.o_area);
        System.out.println("Clerk type speed: " + c.t_speed);
        System.out.println("Adhoc daily wages: " + a.daily_wages);
        System.out.println("Staff code: " + p.s_code);
        System.out.println("Staff name: " + p.s_name);
    }
}

class staff{
    int s_code = 1;
    String s_name = "Rahul";
}

class officer extends staff{
    String o_name = "Vivek";
    String o_class = "IPS";
    String o_area = "Nagpur";
}

class peon extends staff{
    String p_name = "Rohan";
    String w_type = "on-site";
}

class clerk extends staff{
    int t_speed = 30;
}

class adhoc extends peon{
    int daily_wages = 500;
}

class regular extends peon{
    int salary = 40000;
}

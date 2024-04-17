import Body.make_body;            // Import Body Package
import Engine.make_engine;        // Import Engine Package

public class lab8 {
    public static void main(String[] args) {
        make_engine e1 = new make_engine();
        e1.msg1();

        make_body b1 = new make_body();
        b1.msg2();
    }
}

import java.util.*;

    public class Main {
        public static void main(String[] args) {
            IdentifyParts a = new IdentifyParts();
            IdentifyParts b = new IdentifyParts();

            a.y = 5;
            b.y = 6;
            a.x = 1;
            b.x = 2;
            System.out.println("a.y = " + a.y);
            System.out.println("b.y = " + b.y);
            System.out.println("a.x = " + a.x);
            System.out.println("b.x = " + a.x);
            System.out.println("IdentifyParts.x = " + IdentifyParts.x);
        }
    }



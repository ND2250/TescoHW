package arraycomp;

import java.util.ArrayList;

public class Arraylist4 {

    public static void emp(){
        ArrayList dg = new ArrayList();
        dg.add("Customer");
        dg.add("767565678");
        dg.add("Total");
        dg.add(5678789790l);
        dg.add(687687.88f);



        System.out.println(dg.get(3));
        System.out.println(dg.get(2));
        System.out.println(dg.remove(4));
        System.out.println(dg.size());

    }

    public static void main(String[] args) {
        emp();
    }

}

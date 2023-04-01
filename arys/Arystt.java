package arys;

import java.util.ArrayList;

public class Arystt {
    // create a static or non -  static methhod
     void ntfg(){
        ArrayList input = new ArrayList();
        input.add("System");
        input.add("Objects");
        input.add('A');
        input.add(87879);
        input.add(897.97f);

        System.out.println(input.get(4));
        System.out.println(input.size());
        System.out.println(input.get(1));
        System.out.println(input.remove(1));
        System.out.println(input.size());
        System.out.println(input);
    }

    public static void main(String[] args) {
        // call via object name
        Arystt ref = new Arystt();
        ref.ntfg();
    }
}

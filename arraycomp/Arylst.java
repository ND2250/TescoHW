package arraycomp;

import java.util.ArrayList;

public class Arylst {

    public static void mymt(){
        ArrayList og = new ArrayList();
        og.add("Services");
        og.add("Index");
        og.add('c');
        og.add(true);
        og.add(656877687);

        System.out.println(og.get(3));
        System.out.println(og.get(4));
        System.out.println(og.remove(1));
        System.out.println(og);
        System.out.println(og.size());

    }

    public static void main(String[] args) {
        mymt();
    }
}

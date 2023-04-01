package exceptionsprs;

import java.util.ArrayList;

public class Arylist {

     void mymth(){
        ArrayList obb = new ArrayList();
        obb.add("Except");
        obb.add(787);
        obb.add('H');


        System.out.println(obb.size());
        System.out.println(obb.get(2));
        System.out.println(obb.remove(1));


    }

    public static void main(String[] args) {
        Arylist objj = new Arylist();
        objj.mymth();

    }
}

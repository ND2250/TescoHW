package d.wrapeer;

import java.util.ArrayList;

public class Wrapping {
    public static void main(String[] args) {
// primitive data type to wrapping class

        int a = 19;

        Integer aa = new Integer(a); //Boxing wrapping class

 //       or

       Integer bb = a; // Auto boxing

 //     or

        int b = bb.intValue(); // unboxing

  //   or

       int c = bb; // Auto unboxing

//   Use wrapper class

        ArrayList<Integer> Arraylist = new ArrayList<Integer>();
        Arraylist.add(5);


    }

}

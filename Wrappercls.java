import java.util.ArrayList;

public class Wrappercls     {
    public static void main(String[] args) {
       // p to W
        int A = 10;
        Integer aa = new Integer(A); // Boxing wrapper class
      //   or
        Integer bb = A; // Auto boxing

        // W to p

        int b = bb.intValue();
         //or
         int c = bb;// Auto unboxing
        // Use a wrapper class

        ArrayList<Integer>arrayList = new ArrayList<Integer>();
        arrayList.add(5);








    }



}

package arraycomp;

import java.util.ArrayList;

public class Arrylstemp   {

      public static void data(){
         ArrayList obj = new ArrayList();
         obj.add(100);
         obj.add("Total");
         obj.add("Diff");
         obj.add('H');
         obj.add("566687");
         obj.add(true);

          System.out.println(obj.get(2));
          System.out.println(obj.size());
          System.out.println(obj.remove(4));
          System.out.println(obj.size());
          System.out.println(obj);




     }

    public static void main(String[] args) {
          data();

    }

}

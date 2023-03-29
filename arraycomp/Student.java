package arraycomp;

import java.util.ArrayList;

public class Student {


     static void name(){
        ArrayList data = new ArrayList();
        data.add(100);
        data.add("Nikita");
        data.add('s');
        data.add("Tester");
        data.add(8789789789.88989f);
        data.add(88.999);


        System.out.println("Total name of students as per record:"+data);
        System.out.println(data.get(1));
        System.out.println(data.get(4));
        System.out.println(data.remove(3));
        System.out.println(data.size());
        System.out.println(data);

    }

    public static void main(String[] args) {
        name();

    }


}

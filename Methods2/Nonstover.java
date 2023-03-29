package Methods2;

import java.sql.SQLOutput;

public class Nonstover {

    void mymrth(){
        int x = 23;
        int y = 24;
        System.out.println(x+y);
    }
    void mymrth2(){
        char grade = 'H';
        char per = 'F';
        System.out.println("Total: " + grade + " " + "Net total :"+ per);

    }

    public static void main(String[] args) {
        Nonstover obj = new Nonstover();
        obj.mymrth();
        obj.mymrth2();
    }
}

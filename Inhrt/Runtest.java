package Inhrt;

public class Runtest {

    static int itcbatch(int x , int y){
        return x*y;
    }

    public static void main(String[] args) {
        int total = itcbatch(12,56000);
        System.out.println(total);

        System.out.println("Parent class");
        Showergel SH = new Showergel();
        SH.creditires();
        SH.debtores();
        SH.employee();
        SH.salary();
        SH.expense();

        System.out.println("Child class");
        Cream CR = new Cream();
        CR.creditires();
        CR.employee();
        CR.debtores();
        CR.expense();
        CR.salary();


        System.out.println("child class");
        Fiama FM = new Fiama();
        FM.creditires();
        FM.employee();
        FM.debtores();
        FM.expense();
        FM.salary();

        System.out.println("child class");
        Scent st = new Scent();
        st.creditires();
        st.employee();
        st.debtores();
        st.salary();
        st.expense();

        System.out.println("child class");
        Perfume pf = new Perfume();
        pf.employee();
        pf.salary();
        pf.expense();


    }



}

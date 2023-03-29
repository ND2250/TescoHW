package methodpra;

public class Methodovernonstatic2 {

// Method overloading non-static method


    void atoz(String name, String lastname ){
        System.out.println("Fullname :" + name);
        System.out.println("mentioned name :" + lastname);

    }

    public static void main(String[] args) {
        Methodovernonstatic2 obj = new Methodovernonstatic2();
        obj.atoz("Nishant","Dhanani");





    }
}



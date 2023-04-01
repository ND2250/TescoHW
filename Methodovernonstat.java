

public class Methodovernonstat {

    // non - static method declared
    void abc(){
        int A = 43;
        int B = 56;

        System.out.println("Gross : " + A );
        System.out.println("Total : " + B);
    }

    void xyz(){
        String name;
        String data;

        System.out.println("Full name : " + "A to Z");
        System.out.println("Full price : " + "Accepted");
    }

    public static void main(String[] args) {

        // object created and call via object for print or output
        Methodovernonstat ref = new Methodovernonstat();
        ref.abc();
        ref.xyz();

    }
}

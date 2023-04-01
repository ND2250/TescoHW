package Construpract;

public class Constrapara3 {

    // Variable class attributes

    String name;
    float growth;

    // create a constructor parameter and initialise the class attributes

    Constrapara3(String Brandname, float netgrowth){
        name = Brandname;
        growth = netgrowth;


    }

    public static void main(String[] args) {
        // create an object
        Constrapara3 obj = new Constrapara3("Volvo",66.54f);
        // Call the constructor via  object
        System.out.println(obj.growth);
        System.out.println(obj.name);
    }



}

public class Nonstatmth {
    // Declare a non - static method


    public void data(){

        // Initialise and declared an instance variable
        int Age;
        String name;

        Age = 43;
        name = "Krishna";
        // Print Instance variable
        System.out.println("Total data : "+  Age);
        System.out.println("Full name : " + name);

    }

    public static void main(String[] args) {
        // Call the method via object
        Nonstatmth reg = new Nonstatmth();
        reg.data();



    }
}

package objs;

public class Objpr {
// Declared a static variable
    int total;
    String name;
    char Alpha;

    public static void main(String[] args) {
//  create an object
        Objpr obj = new Objpr();
  // Declared a variable under object
        obj.total = 8989;
        obj.Alpha = 'H';
        obj.name  = "Ravi";
//  CAll the object
        System.out.println("Method recall :"+obj.total );
        System.out.println("Another:"+obj.Alpha);
        System.out.println("Another: "+obj.name);

    }
}


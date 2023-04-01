public class Obj {
    // Declared an instance variable
    int Age = 23;
    String name = "Students";
    float per = 55.67f;

    public static void main(String[] args) {
        // create an object
        Obj ref = new Obj();
        System.out.println("Student Age : " + ref.Age + " Students name : " + ref.name);
        System.out.println("Final marks : " + ref.per);

    }
}

package Construpract;

public class Constapara2 {

    // Initialize the class attributes

    String data = "Mid term";
    int age = 67;
    char grade = 'G';

    // create a constructor parameter

    Constapara2(String data, int age, char grade){
        data = "Mid term";
        age = 67;
        grade = 'G';

    }

    public static void main(String[] args) {
        Constapara2 obj = new Constapara2("Mid term",67,'G');
        System.out.println(obj.age + " "+ obj.grade + " " + obj.data);
    }

}

package Methods2;

public class Nonstatpara {

    void mythe(int age, String name){
        System.out.println("A to Z : " + age );
        System.out.println("party :" + name);
    }

    public static void main(String[] args) {
        Nonstatpara obj1 = new Nonstatpara();
        obj1.mythe(35,"Bhupat");
    }
}

package abcs;

public class Nonstatpara {

    // created non - static method
    // print within a  method
    // main method
    // create an object
    // call the method via object

    void myname(String name){
        System.out.println("Full name : " + name);
    }
    void hisname(char grade){
        System.out.println("Grade midterm : " + grade);

    }


    public static void main(String[] args) {
        Nonstatpara uni = new Nonstatpara();
        uni.myname("Nishant patel");
        uni.hisname('A');
    }
}

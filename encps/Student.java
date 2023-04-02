package encps;

public class Student {

    // declared a local and private variable

    public int marks;
    public String name;
    private char grade;


    // getter and setter method
    // this: a private local variable into a class variable

    public void setGrade(char grade){
        this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }
}

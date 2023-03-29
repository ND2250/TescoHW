package objs;

public class Obectspra {

    int total;
    String name;
    char grade;
    float per;



    public static void main(String[] args) {

        Obectspra details = new Obectspra();
        details.total = 787897897;
        details.name = "Jay";
        details.grade = 'A';
        details.per = 67.44f;


        System.out.println("Total for classs A :"+details.total);
        System.out.println("Name of student : "+ details.name);
        System.out.println("Grade :"+details.grade);
        System.out.println("Final per :"+details.per);


    }

}

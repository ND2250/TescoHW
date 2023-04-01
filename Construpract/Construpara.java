package Construpract;

public class Construpara {

    // Class initialize

    String name;
    int year;
    char grade;

    // create a constructor para

    Construpara(String modelname, int pastyear, char topcat ){
        name = modelname;
        year = pastyear;
        grade = topcat;

    }

    public static void main(String[] args) {
        // create an object
        Construpara obj = new Construpara("BMW2",2023,'c');
        System.out.println(obj.name + " " + obj.year + " "+ obj.grade);
    }


    }







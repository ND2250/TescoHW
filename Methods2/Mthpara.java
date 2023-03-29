package Methods2;

public class Mthpara {

    static void nd(String Name, int Age){
        System.out.println("Name of the employee :"+ Name);
        System.out.println("Age of the emloyee :" + Age);
    }
    static void ds(double percentage , char grade){
        System.out.println("Emloyee commission:"+percentage);
        System.out.println("E,mployee grade:"+grade);
    }

    public static void main(String[] args) {
        nd("Sarkar",36);
        ds(55.77,'D');
    }
}

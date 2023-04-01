public class Methodoverstat {

    public static int beta(int age,int numbers){
        return age*numbers;


    }

    static String gama(String name, String DOB){
        return name+DOB;
    }

    public static void main(String[] args) {
        Methodoverstat ref = new Methodoverstat();
        int total  = beta(23,6767);
        System.out.println(total);
        String Grosstotal = gama("Steel traders","09.08.87" );
        System.out.println(Grosstotal);

    }
}

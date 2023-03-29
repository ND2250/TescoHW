package methodpra;

public class methdover  {

    static int abc(int x, int y){
        return x*y;

    }
    static double abc(double x,double y){
        return x*y;
    }


    public static void main(String[] args) {
        int total = abc(67,6700);
        System.out.println(total);
        double sum = abc(77.77,8);
        System.out.println(sum);

    }


    public static class mrtyhod {

        public static int abc(int x, int y) {
            return x + y;
        }

        public static String abc(String name, String lastname ){
            return name + lastname;
            }

        public static void main(String[] args) {
            int total = abc(34,4777);
            System.out.println(total);
            String verification = abc("Nishant","Patel");
            System.out.println(verification);
        }
        }
}

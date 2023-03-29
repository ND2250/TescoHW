package arraycomp;

public class Arrayem3 {

    public static void main(String[] args) {
        int b[] = new int[2];
        b[0] = 3232;
        b[1] = 87979;
        System.out.println(b[0]);
        System.out.println(b[1]);

        String record[] = new String[2];
        record[0] = "Total number";
        record[1] = "unit";
        System.out.println("Total :" + record[0]);
        System.out.println("Emp:"+ record[1] );


        Object total[] = new Object[2];
        total[0] = "company req";
        total[1] = 'h';
        for(int i = 0;i< total.length;i++){
            System.out.println("Details:"+ total[i] );
        }

    }


}

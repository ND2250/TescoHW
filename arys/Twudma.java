package arys;

public class Twudma {

    public static void main(String [] args){

        int a[][] = new int[2][2];
        a[0][0] = 100;
        a[0][1] = 200;

        a[1][0] = 299;
        a[1][1] = 302;

        for (int r = 0;r< a.length;r++ ){
            for(int c = 0; c<a.length;c++){
                System.out.print(a[r][c] + " ");
            }
            System.out.println();
        }
    }



    }


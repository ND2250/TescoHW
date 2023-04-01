package exceptionsprs;

public class Arraycnp {
    public static void main(String[] args) {

        try {
            int A[] = new int[3];
            A[0] = 100;
            A[1] = 200;
            A[2] = 300;
            A[3] = 400;
            System.out.println(A[0]);
            System.out.println(A[1]);
            System.out.println(A[2]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Arraylist is not right");
        }

    }

}

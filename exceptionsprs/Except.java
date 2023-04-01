package exceptionsprs;

public class Except {
    public static void main(String[] args) {

        try{
        int A[] ={1,2,3,4};
        for (int i = 0;i<5;i++){
            System.out.println(A[i]);
        }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array size is not right");
        }
    }
}

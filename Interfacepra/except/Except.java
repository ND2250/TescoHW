package Interfacepra.except;

public class Except {
    public static void main(String [] args){
        try{
        int a[] = {1,2,3,4,5};
        for (int i = 0;i<6;i++){
            System.out.println(a[i]);
        }}catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array size is not right");
        }
        System.out.println("Printed all numbers");

    }


}

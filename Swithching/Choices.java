package Swithching;

public class Choices {
    public static void main(String[] args) {
        int A = 3;
        switch (A){
            case 1:
                System.out.println("A : " + "Excellent");
                break;
            case 2:
                System.out.println("B : " + "Good");
                break;
            case 3:
                System.out.println("C : " + "Very good");
                break;
            case 4:
                System.out.println("D : " + "Perfect");
                break;
            case 5:
                System.out.println("E : " + "Very bad");
            default:
                System.out.println("Not satisfied");

        }
    }
}

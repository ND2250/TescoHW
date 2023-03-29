package Methods2;

public class Mthover {

    static int mymth (int Age,int Height){
        return Age + Height;
    }
    static float mymth(float Grade, float per){
        return Grade + per;
    }

    public static void main(String[] args) {
        int total = mymth(34,156);
        System.out.println(total);
        float Nettotal = mymth(66.55f,55.77f);
        System.out.println(Nettotal);

    }
}

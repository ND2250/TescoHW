public class Thbck {

    public void sum() {
        try {
            div();
        } catch (ArithmeticException e) {

        }
        }
        public void div() throws ArithmeticException {
            int i = 10 / 0;
        }





    public static void main(String[] args) throws ArithmeticException {
        Thbck Th = new Thbck();
        Th.sum();




    }
}

public class ExceptionExercise2 {
    public static void f() throws Exception2 {
        System.out.println("f()");
        throw new Exception2("Ouch from f()");
    }
    public static void main(String[] args) {
        try {
            f();
        } catch(Exception2 e) {
            System.err.println("Caught Exception4");
            e.printStackTrace();
            e.showS();
        }
    }
}

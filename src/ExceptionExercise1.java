public class ExceptionExercise1 {
    public static void f() throws Exception1 {
        System.out.println("Throwing MyException from f()");
        throw new Exception1("From f()");
    }
    public static void main(String[] args) {
        try {
            f();
        } catch(Exception1 e) {
            System.err.println("Caught Exception1");
            e.printStackTrace();
        } finally {
            System.out.println("Made it to finally");
        }

    }
}

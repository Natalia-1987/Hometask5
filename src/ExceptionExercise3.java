public class ExceptionExercise3 {
        private static Integer i = null;
        public static void main(String[] args) {
            try {
                System.out.println(i.toString());
            } catch(NullPointerException e) {
                System.err.println("NullPointerException is caught");
                e.printStackTrace();
            }
            try {
                i = 10;
                System.out.println(i.toString());
            } catch(NullPointerException e) {
                System.err.println("NullPointerException is caught");
                e.printStackTrace();
            } finally {
                System.out.println("Got through it");
            }
        }
    }


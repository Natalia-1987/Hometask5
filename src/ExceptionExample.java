public class ExceptionExample {
        public static void main(String args[]) {
            try {
                throw new Exception("This is new exception in main");
            } catch(Exception e) {
                System.out.println(
                        "e.getMessage() = " + e.getMessage());
            } finally {
                System.out.println("Finally clause to prove");
            }
        }
    }


    class MyException extends Exception {
        String msg;

        public MyException(String msg) {
            this.msg = msg;
        }

        public void printMsg() {
            System.out.println("msg = " + msg);
        }
    }


    public class ExceptionClass {
        public static void main(String args[]) {
            try {
                throw new MyException("Message of my Exception");
            } catch(MyException e) {
                e.printMsg();
            }
        }
    }


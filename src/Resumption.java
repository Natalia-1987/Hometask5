public class Resumption {

    public static void main(String[] args)
    {

         int[] intarr = new int[4];
         int x = 8;

        while(true){
            try{
                intarr[x] = 5;
                System.out.println(intarr[x]);
                break;
            } catch(ArrayIndexOutOfBoundsException e) {
                System.err.println("ArrayIndexOutOfBoundsExcepption is caught");
                e.printStackTrace();
                x--;
            }finally {
                System.out.println("Should we continue?");
            }

        }
        System.out.println(("And now stop"));
    }
}

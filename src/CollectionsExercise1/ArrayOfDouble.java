package CollectionsExercise1;

public class ArrayOfDouble {
    public static void main(String[] args) {
        double [] numbers = new double [8];

        fill(numbers, new RandDoubleGenerator());

        for (double number : numbers) {
            System.out.println(number);
        }
    }

    private static void fill(double[] array, Generator generator) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generator.next();
        }
    }
}

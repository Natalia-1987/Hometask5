package randArrayOfDouble;

import java.util.Random;

public class RandDoubleGenerator implements Generator{
    Random r = new Random();

    @Override
    public double next(){
        return r.nextDouble();
    }
}

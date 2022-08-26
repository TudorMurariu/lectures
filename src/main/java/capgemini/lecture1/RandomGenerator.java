package capgemini.lecture1;

import java.util.Random;

public class RandomGenerator {

    private final Random random = new Random(System.currentTimeMillis());
                                            // or it could be left empty because it still takes a random seed!

    public int random(int max) {
        return random.nextInt(max);
    }

    public int random(int min, int max){
        return random.nextInt(max) + min;
    }
}

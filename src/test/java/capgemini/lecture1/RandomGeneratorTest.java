package capgemini.lecture1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//TODO add unit-tests that check that RandomGenerator returns actually random numbers
class RandomGeneratorTest {

    RandomGenerator randomGenerator = new RandomGenerator();

    @BeforeEach
    void setup() {
        randomGenerator = new RandomGenerator();
    }

    // only given a max
    @Test
    @DisplayName("When given the max as 1 it returns only 0")
    void random_maxOne_returnsZero() {
        int random = randomGenerator.random(1);
        assertEquals(0, random);
        random = randomGenerator.random(1);
        assertEquals(0, random);
        random = randomGenerator.random(1);
        assertEquals(0, random);
        random = randomGenerator.random(1);
        assertEquals(0, random);
    }

    @Test
    @DisplayName("When given max 10 it returns a number smaller than 10")
    void random_maxTen_smallerThanTen() {
        assertTrue(randomGenerator.random(10) < 10);
        assertTrue(randomGenerator.random(10) < 10);
        assertTrue(randomGenerator.random(10) < 10);
        assertTrue(randomGenerator.random(10) < 10);
        assertTrue(randomGenerator.random(10) < 10);
        assertTrue(randomGenerator.random(10) < 10);
    }


    @Test
    @DisplayName("Are the first 100 numbers equal to the first 100 from other seeds?")
    void is_it_Random() {
        int[] first100 = new int[100];
        for(int i=0;i<100;i++)
            first100[i] = randomGenerator.random(100);

        for(int x = 0;x < 101; x++)
        {
            Random r = new Random(x);
            boolean ok = true;
            for(int i=0;i<100;i++)
                if(first100[i] != r.nextInt(100))
                {
                    ok = false;
                    break;
                }

            if(ok)
                assertTrue(false);
        }
    }



}
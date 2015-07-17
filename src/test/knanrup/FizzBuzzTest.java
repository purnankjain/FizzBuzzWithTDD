package knanrup;

import org.junit.Assert;
import org.junit.Test;
public class FizzBuzzTest {

    @Test
    public void fizzForThree() {
        FizzBuzz fb = new FizzBuzz(3);
        String str = fb.checkFizz();
        Assert.assertEquals("Fizz",str);
    }

}

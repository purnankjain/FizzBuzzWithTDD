package knanrup;

import org.junit.Assert;
import org.junit.Test;
public class FizzBuzzTest {

    @Test
    public void fizzForThree() {
        FizzBuzz fb = new FizzBuzz(3);
        boolean isFizz= fb.checkFizz();
        Assert.assertEquals(true,isFizz);
    }

    @Test
    public void notFizzForFour(){
        FizzBuzz fb = new FizzBuzz(4);
        boolean isFizz= fb.checkFizz();
        Assert.assertEquals(false,isFizz);
    }

    @Test
    public void FizzForFifteen(){
        FizzBuzz fb = new FizzBuzz(15);
        boolean isFizz= fb.checkFizz();
        Assert.assertEquals(true,isFizz);
    }


}

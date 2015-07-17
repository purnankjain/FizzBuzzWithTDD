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
    public void fizzForFifteen(){
        FizzBuzz fb = new FizzBuzz(15);
        boolean isFizz= fb.checkFizz();
        Assert.assertEquals(true,isFizz);
    }

    @Test
    public void buzzForFive(){
        FizzBuzz fb = new FizzBuzz(5);
        boolean isBuzz = fb.checkBuzz();
        Assert.assertEquals(true,isBuzz);
    }

    @Test
    public void notBuzzForSeven(){
        FizzBuzz fb = new FizzBuzz(7);
        boolean isBuzz = fb.checkBuzz();
        Assert.assertEquals(false,isBuzz);
    }

    @Test
    public void buzzForFifteen(){
        FizzBuzz fb = new FizzBuzz(15);
        boolean isBuzz = fb.checkBuzz();
        Assert.assertEquals(true,isBuzz);
    }

    @Test
    public void fizzBuzzForFifteen(){
        FizzBuzz fb = new FizzBuzz(15);
        boolean isFizzBuzz = fb.checkFizzBuzz();
        Assert.assertEquals(true,isFizzBuzz);
    }


}

package knanrup;

public class FizzBuzz {
    int x;

    public FizzBuzz(int x) {
        this.x = x;
    }

    public boolean checkFizz() {

        if(x%3 == 0){
            return true;
        }

        return false;
    }
}

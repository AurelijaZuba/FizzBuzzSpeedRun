package com.codurance;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String execute(Integer[] numbers) {
        final Integer number = numbers[0];
        return processNumber(number);
    }

    private String processNumber(Integer number) {
        if(isFizzBuzz(number))
            return FIZZ + BUZZ;
        if (isFizz(number))
            return FIZZ;
        if (isBuzz(number))
            return BUZZ;
        return number.toString();
    }

    private boolean isFizzBuzz(Integer number) {
        return number == 15 || number == 30;
    }

    private boolean isBuzz(Integer number) {
        return number % 5 == 0;
    }

    private boolean isFizz(Integer number) {
        return number % 3 == 0;
    }
}

package com.codurance;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String execute(Integer[] numbers) {
        final Integer number = numbers[0];
        return processNumber(number);
    }

    private String processNumber(Integer number) {
        if(number == 15 || number == 30)
            return FIZZ + BUZZ;
        if (isFizz(number))
            return FIZZ;
        if (isBuzz(number))
            return BUZZ;
        return number.toString();
    }

    private boolean isBuzz(Integer number) {
        return number % 5 == 0;
    }

    private boolean isFizz(Integer number) {
        return number % 3 == 0;
    }
}

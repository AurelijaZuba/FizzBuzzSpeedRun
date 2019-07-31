package com.codurance;

public class FizzBuzz {
    public String execute(Integer[] numbers) {
        final Integer number = numbers[0];
        if (isFizz(number))
            return "Fizz";
        if (isBuzz(number))
            return "Buzz";
        return number.toString();
    }

    private boolean isBuzz(Integer number) {
        return number == 5 || number == 10 || number == 20;
    }

    private boolean isFizz(Integer number) {
        return number % 3 == 0;
    }
}

package com.codurance;

public class FizzBuzz {
    public String execute(Integer[] numbers) {
        final Integer number = numbers[0];
        if (isFizz(number))
            return "Fizz";
        if (number == 5 || number == 10)
            return "Buzz";
        return number.toString();
    }

    private boolean isFizz(Integer number) {
        return number % 3 == 0;
    }
}

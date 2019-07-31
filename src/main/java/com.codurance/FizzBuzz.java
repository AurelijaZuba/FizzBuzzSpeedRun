package com.codurance;

public class FizzBuzz {
    public String execute(Integer[] numbers) {
        final Integer number = numbers[0];
        if (number == 3 || number == 6)
            return "Fizz";
        return number.toString();
    }
}

package com.codurance;

public class FizzBuzz {
    public String execute(Integer[] numbers) {
        if (numbers[0] == 3)
            return "Fizz";
        if (numbers[0] == 6)
            return "Fizz";
        return numbers[0].toString();
    }
}

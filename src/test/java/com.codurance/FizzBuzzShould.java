package com.codurance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzShould {

    @Test
    void return_string_of_one_when_given_integer_of_one() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Integer[] numbers = {1};
        String actual = fizzBuzz.execute(numbers);

        String expected = "1";
        assertThat(actual).isEqualTo(expected);
    }
}

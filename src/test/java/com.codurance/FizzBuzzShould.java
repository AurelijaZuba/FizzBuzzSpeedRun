package com.codurance;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzShould {
    @ParameterizedTest
    @MethodSource("fizzBuzzIntArrays")
    public void returns_fizzbuzz_string_from_int_array(Integer[] numbers, String expected) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.execute(numbers);

        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> fizzBuzzIntArrays() {
        return Stream.of(
                Arguments.of(new Integer[]{1}, "1"),
                Arguments.of(new Integer[]{2}, "2"),
                Arguments.of(new Integer[]{4}, "4"),
                Arguments.of(new Integer[]{3}, "Fizz"),
                Arguments.of(new Integer[]{6}, "Fizz"),
                Arguments.of(new Integer[]{9}, "Fizz"),
                Arguments.of(new Integer[]{5}, "Buzz"),
                Arguments.of(new Integer[]{10}, "Buzz"),
                Arguments.of(new Integer[]{20}, "Buzz"),
                Arguments.of(new Integer[]{15}, "FizzBuzz"),
                Arguments.of(new Integer[]{30}, "FizzBuzz"),
                Arguments.of(new Integer[]{1, 2, 4}, "1, 2, 4")
        );
    }
}

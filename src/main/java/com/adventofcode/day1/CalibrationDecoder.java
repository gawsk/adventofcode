package com.adventofcode.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CalibrationDecoder {
    public CalibrationDecoder(){}
    public static String[] digits = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static String[] reverseDigits = {"eno", "owt", "eerht", "ruof", "evif", "xis", "neves", "thgie", "enin"};


    private static String getDigit(String digit, boolean isBackwards) {
        if (digit.length() == 1) {
            return digit;
        }
        return isBackwards ? String.valueOf(Arrays.asList(reverseDigits).indexOf(digit) + 1) : String.valueOf(Arrays.asList(digits).indexOf(digit) + 1);
    }

    public static int parseCode(String code) {
        String number = "";

        String regex = "(one|two|three|four|five|six|seven|eight|nine|\\d)";
        String backwardsRegex = "(eno|owt|eerht|ruof|evif|xis|neves|thgie|enin|\\d)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(code);

        matcher.find();
        String digit = matcher.group();
        number += getDigit(digit, false);

        pattern = Pattern.compile(backwardsRegex);
        matcher = pattern.matcher(new StringBuilder(code).reverse().toString());

        matcher.find();
        digit = matcher.group();
        number += getDigit(digit, true);

        return Integer.parseInt(number);
    }

    public static void main(String[] args) throws Exception {
        String filePath = "src/main/java/com/adventofcode/day1/";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath + "input.txt"))) {
            String line = br.readLine();
            int total = 0;
            while (line != null) {
                total += parseCode(line);
                line = br.readLine();
            }
            System.out.println(total);
        }
    }
}

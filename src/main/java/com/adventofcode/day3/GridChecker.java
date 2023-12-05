package com.adventofcode.day3;

import java.io.BufferedReader;
import java.io.FileReader;

public class GridChecker {
    


    public static void main(String[] args) throws Exception {
        String filePath = "src/main/java/com/adventofcode/day3/";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath + "input.txt"))) {
            String line = br.readLine();
            int total = 0;

            while (line != null) {
                total = gamePower(line);
                line = br.readLine();
            }
            System.out.println(total);
        }
    }
}

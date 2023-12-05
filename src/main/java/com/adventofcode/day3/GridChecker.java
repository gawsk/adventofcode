package com.adventofcode.day3;

import java.io.BufferedReader;
import java.io.FileReader;

public class GridChecker {
    
    public static int parseGrid(BufferedReader br) {
        String line = br.readLine();

        return 0;
    }


    public static void main(String[] args) throws Exception {
        String filePath = "src/main/java/com/adventofcode/day3/";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath + "input.txt"))) {

            String line = br.readLine();
            line.
            int total = parseGrid(br);
            System.out.println(total);
        }
    }
}

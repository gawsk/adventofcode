package com.adventofcode.day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GridChecker {
    
    public static int parseGrid(List<String> grid) {
        return 0;
    }


    public static void main(String[] args) throws Exception {
        String filePath = "src/main/java/com/adventofcode/day3/";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath + "input.txt"))) {
            List<String> grid = new ArrayList<String>();
            String line = br.readLine();
            while (line != null) {
                grid.add(line);
                line = br.readLine();
            }
            int total = parseGrid(grid);
            System.out.println(total);
        }
    }
}

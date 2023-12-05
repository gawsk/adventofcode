package com.adventofcode.day2;

import java.io.BufferedReader;
import java.io.FileReader;

public class GameChecker {
    private static final int redCubes = 12;
    private static final int greenCubes = 13;
    private static final int blueCubes = 14;

    public static boolean gameValidity(String game) {
        String[] gameIdSplit = game.split(":");
        String[] gameRoundSplit = gameIdSplit[1].split(";");
        for (int round = 0; round < gameRoundSplit.length; round++) {
            String[] cubeSplit = gameRoundSplit[round].split(",");
            for (int i = 0; i < cubeSplit.length; i++) {
                String[] cubeDraw = cubeSplit[i].split(" ");
                switch(cubeDraw[2]) {
                    case "red":
                        if(Integer.valueOf(cubeDraw[1]) > redCubes) {
                            return false;
                        }
                        break;
                    case "green":
                        if(Integer.valueOf(cubeDraw[1]) > greenCubes) {
                            return false;
                        }
                        break;
                    case "blue":
                        if(Integer.valueOf(cubeDraw[1]) > blueCubes) {
                            return false;
                        }
                        break;
                }
            } 
        }
        
        return true;
    }

    

    public static void main(String[] args) throws Exception {
        String filePath = "src/main/java/com/adventofcode/day2/";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath + "input.txt"))) {
            String line = br.readLine();
            int total = 0;
            int id = 1;
            while (line != null) {
                total += gameValidity(line) ? id : 0;
                line = br.readLine();
                id++;
            }
            System.out.println(total);
        }
    }
}

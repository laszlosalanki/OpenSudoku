package com.example.opensudoku;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class TaskGenerator {

    private int[][] szamok;
    private int numOfBaseNumbers = 36;

    public TaskGenerator() {

        szamok = new int[9][9];

        for (int i = 0; i < 9; ++i)
            for(int j = 0; j < 9; ++j)
                szamok[i][j] = 0;

    }

    private int generateRandomNumber() {
        return ThreadLocalRandom.current().nextInt(1, 10);
    }

    public int[][] getLevel() {
        return szamok;
    }

}

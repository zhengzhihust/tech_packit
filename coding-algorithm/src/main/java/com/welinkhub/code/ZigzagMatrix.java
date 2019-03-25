package com.welinkhub.code;

public class ZigzagMatrix {

    public static void printZigzagMatrix(int[][] matrix) {
        int tR = 0,tC = 0,dR = 0,dC = 0;
        int endR = matrix.length - 1;
        int endC = matrix[0].length - 1;
        boolean fromUp = false;
        while(tR != endR + 1) {
            pringLevel(matrix, tR, tC, dR, dC, fromUp);

        }
    }

    public static void pringLevel(int[][] m, int tR, int tC, int dR, int dC, boolean fromUp) {

    }
}

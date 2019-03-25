package com.welinkhub.code;

public class RotateMatrix {
    private static int X[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12},{13,14,15,16}};

    private static void rotateMatrix(int[][] m) {
        int tR = 0;
        int tC = 0;
        int dR = m.length - 1;
        int dC = m[0].length - 1;
        while (tR < dR) {
            rotateEdge(m, tR ++, tC++, dR--, dC--);
        }
        System.out.println(m);
    }

    private static void rotateEdge(int[][] m, int tR, int tC, int dR, int dC) {
        int times = dC - tC;
        int tmp = 0;
        for (int i = 0;i != times;i++) {
            tmp = m[tR][tC+i];
            m[tR][tC+i] = m[dR - i][tC];
            m[dR - i][tC] = m[dR][dC - i];
            m[dR][dC - i] = m[tR + i][dC];
            m[tR + i][dC] = tmp;
        }

    }

    public static void main(String[] args) {
        rotateMatrix(X);
    }
}

package com.welinkhub.code;

import static com.welinkhub.utils.AlgoUtil.print;

public class SpiralOrderMatrix {

    private static int X[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    private static void spiralOrderMatrix(int[][] m) {
        int tR = 0;
        int tC = 0;
        int dR = m.length - 1;
        int dC = m[0].length - 1;

        while (tR <= dR && tC <= dC) {
            printEdge(m, tR++, tC++, dR--, dC--);

        }
    }

    private static void printEdge(int[][] m, int tR, int tC, int dR, int dC) {
        if (tR == dR) {
            for (int i = tC; i <= dC; i++) {
                print(m[tR][i]);
            }
        } else if (tC == dC) {
            for (int i = tR; i <= dR; i++) {
                print(m[i][tC]);
            }
        } else {
            int curR = tR;
            int curC = tC;
            while (curC != dC) {
                print(m[tR][curC]);
                curC++;
            }
            while (curR != dR) {
                print(m[curR][dC]);
                curR++;
            }
            while (curC != tC) {
                print(m[dR][curC]);
                curC--;
            }
            while (curR != tR) {
                print(m[curR][tC]);
                curR--;
            }
        }

    }

}

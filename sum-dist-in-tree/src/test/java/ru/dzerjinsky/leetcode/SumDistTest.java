package ru.dzerjinsky.leetcode;

import static java.lang.System.arraycopy;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class SumDistTest {

    @Test
    public void main() {
        // var app = new SumDist();
        int n = 6;
        int[][] e = new int[][] { { 0, 1 }, { 0, 2 }, { 2, 3 }, { 2, 4 }, { 2, 5 } };
        int[] result = new int[n];
        int[] r = new int[n]; // i-element points to [i] parent
        // init from args
        r[0] = -1;
        for (int i = 1; i < n - 1; i++) {
            r[e[i][1]] = e[i][0];
        }
        assertThat(r).containsOnly(new int[] { -1, 0, 0, 2, 2, 2 });
        int cn = 0;
        do {
            // make weightTree
            // calc sum
            cn++;
            if (cn <= n - 1) { // for each node
                int ni = cn;
                do {
                    int buf = r[r[ni]];
                    r[r[ni]] = ni;
                    ni = buf;
                } while (ni != -1);
                r[cn] = -1;
                System.out.println(r);
            }
        } while (cn <= n - 1);
        // var result = app.sumDistancesInTree(n, edges);
        int[] expected = new int[] { 8, 12, 6, 10, 10, 10 };
        // Assertions.assertThat(result).containsOnly(expected);
    }
}

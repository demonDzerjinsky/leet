package ru.dzerjinsky.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class SumDistTest {

    @Test
    public void main() {
        // var app = new SumDist();
        int n = 6;
        int[][] e = new int[][] { { 0, 1 }, { 0, 2 }, { 2, 3 }, { 2, 4 }, { 2, 5 } };
        int[] result = new int[n];
        int[] r = new int[n]; // i-element points to r[i] parent
        r[0] = -1;
        for (int i = 1; i < n - 1; i++) {
            r[e[i][1]] = e[i][0];
        }
        assertThat(r).containsOnly(new int[] { -1, 0, 0, 2, 2, 2 });
        for (int cn = 0; cn < n; cn++) {
            if (r[cn] != -1) { // make tree with root in r[cn]
                int ni = cn;
                int buf = -1;
                int nii;
                while ((nii = r[ni]) != -1) {
                    r[ni] = buf;
                    buf = ni;
                    ni = nii;
                }
                r[ni] = buf;
            }
            // calc node weights sum
            for (int i = 0; i < n; i++) {
                int ci = i;
                while (r[ci] != -1) {
                    result[cn]++;
                    ci = r[ci];
                }
            }
            // calc sum
            for (int i : r) {
                System.out.print(String.format("%d ", i));
            }
            System.out.println();
        }
        assertThat(result).containsOnly(new int[] { 8, 12, 6, 10, 10, 10 });
        System.out.println();
        for (int i : result) {
            System.out.print(String.format("%d ", i));
        }
        // var result = app.sumDistancesInTree(n, edges);
        int[] expected = new int[] { 8, 12, 6, 10, 10, 10 };
        // Assertions.assertThat(result).containsOnly(expected);
    }
}

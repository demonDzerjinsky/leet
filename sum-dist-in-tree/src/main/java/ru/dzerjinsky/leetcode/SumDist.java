package ru.dzerjinsky.leetcode;

public class SumDist {
    public int[] sumDistancesInTree(int n, int[][] edges) {
        int[] result = new int[n];
        int[] r = new int[n]; // i-element points to r[i] parent
        r[0] = -1;
        for (int i = 1; i < n - 1; i++) {
            r[edges[i][1]] = edges[i][0];
        }
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
        }
        return result;
    }
}

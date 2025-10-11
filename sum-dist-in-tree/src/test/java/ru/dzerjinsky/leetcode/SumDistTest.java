package ru.dzerjinsky.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SumDistTest {

    @Test
    @Disabled
    public void case1() {
        var app = new SumDist();
        int n = 6;
        int[][] edges = new int[][] { { 0, 1 }, { 0, 2 }, { 2, 3 }, { 2, 4 }, { 2, 5 } };
        var result = app.sumDistancesInTree(n, edges);
        int[] expected = new int[] { 8, 12, 6, 10, 10, 10 };
        Assertions.assertThat(result).containsOnly(expected);
    }
}

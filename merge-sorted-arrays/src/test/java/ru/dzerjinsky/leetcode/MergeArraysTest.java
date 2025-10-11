package ru.dzerjinsky.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MergeArraysTest {

    @Test
    public void case1() {
        var app = new MergeArrays();
        int[] n1 = new int[] { 1, 2, 3, 0, 0, 0, 0 };
        int c1 = 3;
        int[] n2 = new int[] { 4, 5, 6, 7 };
        int c2 = 4;
        app.merge(n1, c1, n2, c2);
        assertThat(n1).containsExactly(new int[] { 1, 2, 3, 4, 5, 6, 7 });
    }

    @Test
    public void case2() {
        var app = new MergeArrays();
        int[] n1 = new int[] { 4, 5, 6, 7, 0, 0, 0 };
        int c1 = 4;
        int[] n2 = new int[] { 1, 2, 3 };
        int c2 = 3;
        app.merge(n1, c1, n2, c2);
        assertThat(n1).containsExactly(new int[] { 1, 2, 3, 4, 5, 6, 7 });
    }

    @Test
    public void case3() {
        var app = new MergeArrays();
        int[] n1 = new int[] { 2, 5, 6, 7, 0, 0, 0 };
        int c1 = 4;
        int[] n2 = new int[] { 1, 2, 3 };
        int c2 = 3;
        app.merge(n1, c1, n2, c2);
        assertThat(n1).containsExactly(new int[] { 1, 2, 2, 3, 5, 6, 7 });
    }

    @Test
    public void case4() {
        var app = new MergeArrays();
        int[] n1 = new int[] { 2, 5, 6, 0, 0, 0, 0 };
        int c1 = 3;
        int[] n2 = new int[] { 1, 2, 3, 7 };
        int c2 = 4;
        app.merge(n1, c1, n2, c2);
        assertThat(n1).containsExactly(new int[] { 1, 2, 2, 3, 5, 6, 7 });
    }

    @Test
    public void case5() {
        var app = new MergeArrays();
        int[] n1 = new int[] { 1 };
        int c1 = 1;
        int[] n2 = new int[] {};
        int c2 = 0;
        app.merge(n1, c1, n2, c2);
        assertThat(n1).containsExactly(new int[] { 1 });
    }

    @Test
    public void case6() {
        var app = new MergeArrays();
        int[] n1 = new int[] { 0 };
        int c1 = 0;
        int[] n2 = new int[] { 1 };
        int c2 = 1;
        app.merge(n1, c1, n2, c2);
        assertThat(n1).containsExactly(new int[] { 1 });
    }

}

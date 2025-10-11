package ru.dzerjinsky.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveElementTest {

    @Test
    public void case1() {
        var app = new RemoveElement();
        int[] nums = new int[] { 1, 2, 3, 4 };
        int result = app.removeElement(nums, 5);
        Assertions.assertThat(result).isEqualTo(4);
        int[] expected = new int[] { 1, 2, 3, 4 };
        Assertions.assertThat(nums).containsExactly(expected);
    }

    @Test
    public void case2() {
        var app = new RemoveElement();
        int[] nums = new int[] { 5, 5, 5, 5 };
        int result = app.removeElement(nums, 5);
        Assertions.assertThat(result).isEqualTo(0);
        int[] expected = new int[] { 5, 5, 5, 5 };
        Assertions.assertThat(nums).containsExactly(expected);
    }

    @Test
    public void case3() {
        var app = new RemoveElement();
        int[] nums = new int[] { 1, 5, 3, 5 };
        int result = app.removeElement(nums, 5);
        Assertions.assertThat(result).isEqualTo(2);
        int[] expected = new int[] { 1, 3, 3, 5 };
        Assertions.assertThat(nums).containsExactly(expected);
    }

}

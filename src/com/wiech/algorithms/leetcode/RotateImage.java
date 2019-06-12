/*
 * @author Andrzej Wiech
 */

package com.wiech.algorithms.leetcode;

public class RotateImage {

    public void rotate(int[][] matrix) {

        int frameSize = matrix.length;

        for (int i = 0; i < matrix.length / 2; i++) {
            int l = frameSize - 1;
            for (int j = 0; j < frameSize - 1; j++) {
                int tmp = matrix[i][i + j];
                matrix[i][i + j] = matrix[i + l][i];
                matrix[i + l][i] = matrix[i + l + j][i + l];
                matrix[i + l + j][i + l] = matrix[i + j][i + l + j];
                matrix[i + j][i + l + j] = tmp;
                l--;
            }
            frameSize -= 2;
        }
    }
}

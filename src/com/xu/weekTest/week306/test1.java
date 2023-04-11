package com.xu.weekTest.week306;

public class test1 {

        public int[][] largestLocal(int[][] grid) {
            int n=grid.length;
            int[][] maxLocal = new int[n-2][n-2];
            for(int i=0;i<n;i++){
               for(int j=0;j<n;j++){
                    for(int p=0;p<3;p++){
                        for(int q=0;q<3;q++){
                            maxLocal[p][q]=Math.max(maxLocal[i+p][j+q],grid[i][j]);
                        }
                    }
               }
            }
            return maxLocal;

        }


    public static void main(String[] args) {

    }
}

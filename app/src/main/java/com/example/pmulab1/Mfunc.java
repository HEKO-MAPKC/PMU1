package com.example.pmulab1;

/**
 * Class find min, max
 */
public class Mfunc {
    /**
     * Func find max
     * @param arr input
     * @return max
     */
    public int getMax(int[] arr){
        int maxV = arr[0];
        for(int i=1;i < arr.length;i++){
            if(arr[i] > maxV){
                maxV = arr[i];
            }
        }
        return maxV;
    }

    /**
     * Func find min
     * @param arr input
     * @return min
     */
    public int getMin(int[] arr){
        int minV = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < minV){
                minV = arr[i];
            }
        }
        return minV;
    }
}

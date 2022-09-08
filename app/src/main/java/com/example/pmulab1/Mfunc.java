package com.example.pmulab1;

public class Mfunc {
    public int getMax(int[] arr){
        int maxV = arr[0];
        for(int i=1;i < arr.length;i++){
            if(arr[i] > maxV){
                maxV = arr[i];
            }
        }
        return maxV;
    }
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

package com.company;

public class Vargs {
    //int max(int a,int b,int ...x)
    static int max(int... x) {
        int max = x[0];
        for (int i = 0; i < x.length; i++)
            if (max < x[i])
                max = x[i];
        return max;
    }

    public static void main(String[] args) {
        int arr1[] = {20, 10, 5, 35, 40};
        int result = max(arr1);
        System.out.println("maximum=" + result);
        int arr2[] = {1, 2, 3};
        result = max(arr2);
        System.out.println("maximum=" + result);
        result = max(10, 30);
        System.out.println("maximum=" + result);
    }
}

package com.company;

public class FindLargestSmallest {

    public static void findLargestSmallest(int[] a){
        if (a.length < 1){
            System.out.println("There is no element in array");
        } else {
            int max = a[0];
            int min = a[0];
            for (int j : a) {
                if (j > max)
                    max = j;
                if (j < min)
                    min = j;
            }
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
        }
    }

    public static void main(String[] args) {
        int[] intArray = {3,4,3,5,6,3,5,6,8,3,9,10,2,3,4,1};
        findLargestSmallest(intArray);
        IsPalindromeNumber check = new IsPalindromeNumber();
        int i = 1221;
        check.checkPalindromeNumber(i);
        FibonacciReverse f = new FibonacciReverse();
        f.printFibonacci(10);
        f.printFibonacciReverse(10);
    }
}

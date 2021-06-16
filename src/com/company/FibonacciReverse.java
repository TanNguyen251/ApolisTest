package com.company;

public class FibonacciReverse {
    public void printFibonacci(int n){
        if (n < 3) {
            switch (n) {
                case 0 -> System.out.println("No Fibonacci for 0");
                case 1 -> System.out.println("1");
                case 2 -> System.out.println("1 1");
            }
        } else {
            int[] a = {1,1};
            for (int i = 0; i < n; i++) {
                if (i<2){
                    System.out.print(a[i] + " ");
                } else {
                    int sum = a[0] + a[1];
                    a[0] = a[1];
                    a[1] = sum;
                    System.out.print(sum + " ");
                }
            }
        }
    }

    public void printFibonacciReverse(int n) {
        if (n < 3) {
            switch (n) {
                case 0 -> System.out.println("No Fibonacci for 0");
                case 1 -> System.out.println("1");
                case 2 -> System.out.println("1 1");
            }
        } else {
            int[] a = {1,1};
            int[] r= new int[n];
            for (int i = 0; i < n; i++) {
                if (i<2){
                    r[i] = a[i];
                } else {
                    int sum = a[0] + a[1];
                    a[0] = a[1];
                    a[1] = sum;
                    r[i] = sum;
                }
            }
            for (int j = r.length -1 ; j >= 0; j--){
                System.out.print(r[j] + " ");
            }
        }
    }
}

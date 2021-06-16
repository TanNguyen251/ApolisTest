package com.company;

public class IsPalindromeNumber {
    public boolean checkPalindromeNumber(int a){
        String str = String.valueOf(a);
        if(str.length()<1){
            System.out.println("Empty Number");
            return false;
        } else {
            for (int i = 0; i < str.length() / 2; i++) {
                if (!str.substring(i, i + 1).equals(str.substring(str.length() - i - 1, str.length() - i))) {
                    System.out.println("Number is not Palindrome");
                    return false;
                }
            }
            System.out.println("Number is Palindrome");
            return true;
        }
    }
}

package com.Demo;

import java.util.Arrays;

public class Demo2 {
    public static boolean isAnagramOfDog(String s1) {
        String str = "Dog";
        
        str = str.replaceAll("\\s", "").toLowerCase();
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        
        if (str.length() != s1.length()) {
        }

        char[] charArray1 = str.toCharArray();
        char[] charArray2 = s1.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String s2 = "God";

        if (isAnagramOfDog(s2)) {
            System.out.println(s2);
        } else {
            System.out.println(s2);
        }
    }
}

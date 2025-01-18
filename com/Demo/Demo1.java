package com.Demo;

public class Demo1    
{    
     public static void main(String[] args) {    
        String str = "Java is a programming language";    
        int[] f = new int[str.length()];    
        int m, n;    
            
        char string[] = str.toCharArray();    
           for(m = 0; m <str.length(); m++) {    
            f[m] = 1;    
             for(n = m+1; n <str.length(); n++) {    
                if(string[m] == string[n]) {    
                    f[m]++;    
                        string[n] = '0';    
                }    
            }    
        }       
        for(m = 0; m <f.length; m++) {    
            if(string[m] != ' ' && string[m] != '0')    
                System.out.println(string[m] + "-" + f[m]);    
        }    
    }    
}    

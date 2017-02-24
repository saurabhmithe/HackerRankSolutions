import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int len = scanner.nextInt();
        scanner.close();
        
        String smallest = str.substring(0, len);
        String largest = "";
        
        for(int i = 0; i <= str.length() - len; i++) {
            String subStr = str.substring(i, i+len);
            if(subStr.compareTo(smallest) <= 0) {
                smallest = subStr;
            }
            if(subStr.compareTo(largest) > 0) {
                largest = subStr;
            }
        }
        
        System.out.println(smallest);
        System.out.println(largest);       
    }
} 

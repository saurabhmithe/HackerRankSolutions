import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // getting rid of leading spaces
        s = s.trim();
        
        if(s.length() == 0) {
            System.out.print("0");
            return;
        }
        
        String[] splits = s.split("[ !\\,\\?.\\_'@]+");
        System.out.println(splits.length);
        for (String string : splits) {
            System.out.println(string);
        }
        scan.close();
    }
}

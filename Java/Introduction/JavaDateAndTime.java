import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        Calendar rightNow = Calendar.getInstance();
        rightNow.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
        
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        System.out.print(days[rightNow.get(Calendar.DAY_OF_WEEK) - 1]);
    }
}

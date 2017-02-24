import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat usInstance = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usInstance.format(payment);
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaInstance = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = indiaInstance.format(payment);
        NumberFormat chinaInstance = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaInstance.format(payment);
        NumberFormat franceInstance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceInstance.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        Comparator<String> bigDecimalComparator = new Comparator<String>() {
            @Override
            public int compare(String firstString, String secondString) {
                BigDecimal first = new BigDecimal(firstString);
                BigDecimal second = new BigDecimal(secondString);
                return second.compareTo(first);
            }
        };

        Arrays.sort(s, 0, n, bigDecimalComparator);

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}

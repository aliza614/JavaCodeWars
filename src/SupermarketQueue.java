
import java.util.Arrays;

public class SupermarketQueue {

        public static int solveSuperMarketQueue(int[] customers, int n) {
            int answer=0;
            if (customers.length==0) return 0;
            for (int customer:
                 customers) {
                answer+=customer;

            }
            Arrays.sort(customers);
            double d;
            return Math.max(answer/n,customers[customers.length-1]);

        }

}


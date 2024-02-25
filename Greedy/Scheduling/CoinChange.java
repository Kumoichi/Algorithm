import java.util.ArrayList;
import java.util.List;

public class CoinChange {

    public static List<Integer> coinChange(int[] denominations, int amount) {
        List<Integer> result = new ArrayList<>();
        int k = -1;
        while(amount > 0)
        {
            for(int i = 0; i < denominations.length; i++)
            {
                if(amount - denominations[i] >= 0)
                {
                    k = denominations[i];
                }
                else {
                    break;
                }
            }
            amount = amount -k;
            result.add(k);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] denominations = {1, 2, 5, 10, 20, 50, 100, 500, 1000}; // Assuming denominations are sorted
        int amount = 93;

        List<Integer> change = coinChange(denominations, amount);

        if (change != null) {
            System.out.println("Change: " + change);
        } else {
            System.out.println("No solution exists.");
        }
    }
}

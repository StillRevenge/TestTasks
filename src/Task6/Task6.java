package Task6;

import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {

    public static int CheckItems(int weight[], int cost[], int backpack)
    {
        int n = weight.length;
        int dp[][] = new int[backpack + 1][n + 1];
        for (int j = 1; j <= n; j++) {
            for (int w = 1; w <= backpack; w++) {
                if (weight[j-1] <= w) {
                    dp[w][j] = Math.max(dp[w][j - 1], dp[w - weight[j-1]][j - 1] + cost[j-1]);
                } else {
                    dp[w][j] = dp[w][j - 1];
                }
            }
        }
        return dp[backpack  ][n];
    }
    public static void main(String[] args){
        int  backpack;
        int count;
        Scanner in = new Scanner(System.in);
        System.out.println("введите грузоподьемность рюкзака");
        backpack = in.nextInt();
        System.out.println("Введите количество предметов");
        count = in.nextInt();
        int[] cost = new int[count];
        int[] weight = new int[count];
        for(int i=0; i<count; i++)
        {
            int q=i+1;
            System.out.println("Введите стоимость и массу предмета "+ q);
            cost[i]= in.nextInt();
            weight[i] = in.nextInt();
        }
        System.out.println(CheckItems(cost,weight,backpack));

    }
}

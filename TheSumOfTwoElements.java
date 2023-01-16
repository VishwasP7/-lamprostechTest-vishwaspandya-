
import java.util.Scanner;


public class SumOfTwo {

    private static int[] findSum(int[] num1, int target) 
    {
        for (int i = 0; i < num1.length; i++) 
        {
            for (int j = i + 1; j < num1.length; j++) 
            {
                if (nums[i] + num1[j] == target) 
                {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }


    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] num = new int[n];

        for(int i = 0; i < n; i++) 
        {
            num[i] = in.nextInt();
        }
        int t = in.nextInt();

        in.close();

        int[] indices = findSum(num, t);

        if (indices.length == 2) 
        {
            System.out.println(indices[0] + " " + indices[1]);
        } 
        else 
        {
            System.out.println("No solution found!");
        }
    }
}

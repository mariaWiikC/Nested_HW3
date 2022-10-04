package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] nums = {3, 7, 4};

        for (int k = 0; k < nums.length; k++)
        {
            int l = 0;
            for (; l < nums.length; l++)
            {
                if (k != l)
                    System.out.println(10 * nums[k] + nums[l]);
            }
        }

    }
}

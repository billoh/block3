package com.company;
import java.util.Scanner;

public class Main {

    public static double factK(int n)
    {
        int res = 1;
        for (int i = 2; i <= n; ++i) {
            res *= i;
        }
        return res;

    }
    public static void main(String[] args)
    {
	    Scanner in = new Scanner(System.in);
        double y = 2;
        int n = in.nextInt();

        for(int i = 2; i <= n; i++)
            {
                y += 1 / factK(i);
            }
        System.out.println("y: " + y);

    }
}

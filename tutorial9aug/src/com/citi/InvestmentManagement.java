package com.citi;

import java.util.ArrayList;

public class InvestmentManagement
{
	public static void main(String[] args)
	{
		Stock stocks[] = new Stock[5];

		stocks[0] = new Stock("IBM", 53, 2000);
		stocks[1] = new Stock("infosys", 64, 32000);
		stocks[2] = new Stock("accenture", 108, 13334);
		stocks[3] = new Stock("cognizant", 3400, 67768);
		stocks[4] = new Stock("CITI", 1274, 2933);

		ArrayList<Integer> allItems = new ArrayList<Integer>();

		for (int i = 0; i < stocks.length; i++)
		{
			for (int j = 0; j < stocks[i].getQuantity(); j++)
				allItems.add(stocks[i].getPrice());
		}

		System.out.println("Best :"
				+ aggrandizer(10000, allItems.toArray(new Integer[0]),
						allItems.toArray(new Integer[0]), allItems.size()));
	}

	static int aggrandizer(int W, Integer wt[], Integer val[], int n)
	{
		int i, w;
		int[][] K = new int[n + 1][W + 1];

		// Build table K[][] in bottom up manner
		for (i = 0; i <= n; i++)
		{
			for (w = 0; w <= W; w++)
			{
				if (i == 0 || w == 0)
					K[i][w] = 0;
				else if (wt[i - 1] <= w)
					K[i][w] = max(val[i - 1] + K[i - 1][w - wt[i - 1]],
							K[i - 1][w]);
				else
					K[i][w] = K[i - 1][w];
			}
		}

		return K[n][W];
	}

	public static int max(int a, int b)
	{
		if (a > b)
			return a;
		else
			return b;
	}
	/*
	 * double orderValue(Stock F, int orderQuantity) { double value =
	 * orderQuantity * F.getPrice(); return value; }
	 */

	// double amount = orderValue(A, quantityA) + orderValue(B, quantityB)
	// + orderValue(C, quantityC)
	// + orderValue(D, quantityD)
	// + orderValue(E, quantityE);

}

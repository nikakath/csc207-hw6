package edu.grinnell.csc207.nikakath_byrnefio.dutchflag;

import java.io.*;

/** @author Kitt Nika & Fiona Byrne **/

public class DutchFlag {
	
	public static void main(String[] args) throws Exception {
		
		/* Experiments! */
		
		int[] ugh = {0, 2, 1, 1, 2, 0, 0, 2, 1};
		int[] nope = {};
		int[] notToday = {1};
		int[] notEver = {0, 1, 1, 0, 0, 0, 1};
		
		flagSort(ugh);
		flagSort(nope);
		flagSort(notToday);
		flagSort(notEver);
		
		/* Standard Case! */
		PrintWriter pen = new PrintWriter(System.out, true);
		pen.print("{");
		for (int i = 0; i < ugh.length; i++) {
			pen.print(ugh[i] + ",");
		}
		pen.println("}");

		/* Null Case! */
		pen.print("{");
		for (int i = 0; i < nope.length; i++) {
		pen.print(nope[i] + ",");
		}
		pen.println("}");

		/* Singleton Case! */
		pen.print("{");
		for (int i = 0; i < notToday.length; i++) {
		pen.print(notToday[i] + ",");
		}
		pen.println("}");
		
		/* Non-Standard Case! */
		pen.print("{");
		for (int i = 0; i < notEver.length; i++) {
		pen.print(notEver[i] + ",");
		}
		pen.println("}");
		
		pen.close();
		
	} //main

	/* Preconditions: Takes an array of integers whose members are all 0s, 1s, or 2s.
	 * Each number does not need to be present.
	 * Postconditions: The members of the array are sorted in ascending order.  The array
	 * is mutated, and not returned. */
	
	public static void flagSort(int[] flag) {
		
		int red = 0;
		int blue = 2;	
		
		for (int i = 0; i < flag.length; i++) {
		
			int redbound = 0;
			int bluebound = flag.length - 1;
			
			/* If flag[i] is not properly placed within the correct bounds, keep swapping
			 * until it is. */
			while ((flag[i] == red && i != redbound)
					|| (flag[i] == blue && i != bluebound)) {
			
				/* Place flag[i] at the appropriate boundary and increment that boundary */
				if (flag[i] == red) {
					swap(flag, i, redbound);
					redbound++;
				} // if
				
				else if (flag[i] == blue) {
					swap(flag, i, bluebound);
					bluebound--;
				} // if
			} // while
		} // for
	} // flagSort(int[])
	
	/* Preconditions: Takes an array of integers, and two indices within the bounds of the
	 * array's length.
	 * Postconditions: Swaps the values at the given indices within the array.  The array
	 * is mutated, and not returned. */
	
	private static void swap(int[] array, int a, int b) {
		
		int temp = array[b];
		array[b] = array[a];
		array[a] = temp;
		
	}
	
} // DutchFlag

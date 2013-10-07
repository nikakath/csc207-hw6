package edu.grinnell.csc207.nikakath_byrnefio.dutchflag;

import java.io.*;

public class DutchFlag {
	
	public static void main(String[] args) throws Exception {
		
		int[] ugh = {0, 2, 1, 1, 2, 0, 0, 2, 1};
		int[] nope = {};
		int[] notToday = {1};
	int[] notEver = {0, 1, 1, 0, 0, 0, 1};
		
		flagSort(ugh);
		flagSort(nope);
		flagSort(notToday);
		flagSort(notEver);
		
		PrintWriter pen = new PrintWriter(System.out, true);
		pen.print("{");
		for (int i = 0; i < ugh.length; i++) {
			pen.print(ugh[i] + ",");
		}
		pen.println("}");

		pen.print("{");
		for (int i = 0; i < nope.length; i++) {
		pen.print(nope[i] + ",");
		}
		pen.println("}");

		pen.print("{");
		for (int i = 0; i < notToday.length; i++) {
		pen.print(notToday[i] + ",");
		}
		pen.println("}");
		
	pen.print("{");
		for (int i = 0; i < notEver.length; i++) {
		pen.print(notEver[i] + ",");
		}
		pen.println("}");
		
		pen.close();
	} //main

	public static void flagSort(int[] flag) {
		
		int red = 0;
		int blue = 2;
		
		for (int i = 0; i < flag.length; i++) {
			
			int redbound = 0;
			int bluebound = flag.length - 1;
			
			while ((flag[i] == red && i != redbound)
					|| (flag[i] == blue && i != bluebound)) {
				
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
	
	private static void swap(int[] array, int a, int b) {
		
		int temp = array[b];
		array[b] = array[a];
		array[a] = temp;
		
	}
	
} // DutchFlag

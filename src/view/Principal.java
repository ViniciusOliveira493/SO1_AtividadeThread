package view;

import controller.ThreadCalc;

public class Principal {
	public static void main(String[] args) {
		/*
		for (int tId = 0; tId < 5; tId++) {
			Thread threadId = new ThreadId(tId);
			threadId.start();
		}
		*/
		
		int a = 10;
		int b = 2;
		
		for (int op = 0; op < 4; op++) {
			Thread tCalc = new ThreadCalc(a, b, op);
			tCalc.start();
		}
	}
}

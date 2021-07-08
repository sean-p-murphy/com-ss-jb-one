package com.ss.jb.one.one;

public class OneApplication {

	public static void main(String[] args) {
		System.out.println("1)");
		for (int i = 1; i <= 4; i++) {
			printLine(i, "*");
		};
		printLine(9, ".");
		System.out.println("2)");
		printLine(10, ".");
		for (int i = 4; i > 0; i--) {
			printLine(i, "*");
		};
		System.out.println("3)");
		int starCount = 1;
		for (int i = 5; i > 1; i--) {
			printIndentLine(i);
			printLine(starCount, "*");
			starCount = starCount + 2;
		};
		printLine(11, ".");
		System.out.println("4)");
		printLine(12, ".");
		starCount = 7;
		for (int i = 2; i < 6; i++) {
			printIndentLine(i);
			printLine(starCount, "*");
			starCount = starCount - 2;
		};
	};

	static void printIndentLine(int Count) {
		for (int i = 0; i < Count; i++) {
			System.out.print(" ");
		};
	};

	static void printLine(int Count, String Char) {
		for (int i = 0; i < Count; i++) {
			System.out.print(Char);
		};
		System.out.println("");
	}

}

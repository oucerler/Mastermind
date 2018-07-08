package Week2;

import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {
		Scanner word = new Scanner (System.in);
		int fnum, snum, tnum, fonum, answer;
		fnum = 1;
		snum = 9;
		tnum = 8;
		fonum = 4;
		answer = 1984;
		System.out.println(answer);
		
		System.out.println("Enter first number: ");
		fnum = word.nextInt();		
		System.out.println("Enter second number: ");
		snum = word.nextInt();
		System.out.println("Enter third number: ");
		tnum = word.nextInt();
		System.out.println("Enter fourth number: ");
		fonum = word.nextInt();
		
		System.out.println(fnum == 1 ? "Yes! Your first number is correct" : "Sorry, your first number is incorrect");
		System.out.println(fnum == 9 ? "Warm! It's in there somewhere": "Sorry, your first number is incorrect");
		System.out.println(fnum == 8 ? "Warm! It's in there somewhere": "Sorry, your first number is incorrect");
		System.out.println(fnum == 4 ? "Warm! It's in there somewhere": "Sorry, your first number is incorrect");
		
		System.out.println(snum == 9 ? "Yes! Your first number is correct" : "Sorry, your first number is incorrect");
		System.out.println(snum == 1 ? "Warm! It's in there somewhere": "Sorry, your first number is incorrect");
		System.out.println(snum == 8 ? "Warm! It's in there somewhere": "Sorry, your first number is incorrect");
		System.out.println(snum == 4 ? "Warm! It's in there somewhere": "Sorry, your first number is incorrect");
		
		System.out.println(tnum == 8 ? "Yes! Your first number is correct" : "Sorry, your first number is incorrect");
		System.out.println(tnum == 1 ? "Warm! It's in there somewhere": "Sorry, your first number is incorrect");
		System.out.println(tnum == 9 ? "Warm! It's in there somewhere": "Sorry, your first number is incorrect");
		System.out.println(tnum == 4 ? "Warm! It's in there somewhere": "Sorry, your first number is incorrect");
		
		System.out.println(fonum == 4 ? "Yes! Your first number is correct" : "Sorry, your first number is incorrect");
		System.out.println(fonum == 1 ? "Warm! It's in there somewhere": "Sorry, your first number is incorrect");
		System.out.println(fonum == 9 ? "Warm! It's in there somewhere": "Sorry, your first number is incorrect");
		System.out.println(fonum == 8 ? "Warm! It's in there somewhere": "Sorry, your first number is incorrect");
	}
}

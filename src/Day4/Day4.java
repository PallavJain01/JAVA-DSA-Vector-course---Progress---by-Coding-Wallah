package src.Day4;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.io.IOException;

import java.util.Scanner;

public class Day4 {
		public static void main(String[] args) {
		// Input- Command line arguments
		System.out.println(args[1]);

		// Initialize the scanner object
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String st = sc.nextLine();
		System.out.println("Your entered value is " + st);
		char ch = sc.next().charAt(1);
		System.out.println("Your Enterd Value is " + ch);
		// Close the scanner object
		sc.close();

		// Input- Using BufferedReader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = reader.readLine();
			System.out.println("Your input = " + input);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		// Output - print, println, printf, format, err
		System.out.print("Shivam");
		System.out.println("Sharma");
		float n = 5.2222232f;
		System.out.printf("%10.5f", n);

		// Date Format
		System.out.println(new Date());
		SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
		String str = ft.format(new Date());
		System.out.println("Formatted Date : " + str);
		System.out.format("%d", 1);
	}
}
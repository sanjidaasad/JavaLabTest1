package main;

import java.util.Scanner;

public class SoundRunner {
	static Sound sound = new Sound();
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter time: ");
		int time = input.nextInt();
		double distance = sound.calculation(time);
		System.out.println("Distance is " + distance + " feet");
	}

}

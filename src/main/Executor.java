package main;

import java.util.List;
import java.util.Scanner;

import entities.Counter;

public class Executor {
	private static Counter counter = new Counter();
	
	public static void execute() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		counter.setNumberOne(scanner.nextInt());
		System.out.print("Digite o segundo numero: ");
		counter.setNumberTwo(scanner.nextInt());
		
		List<Integer> numbers = counter.count();
		
		System.out.println();
		for(Integer number : numbers) {
			System.out.print(number + " ");
		}
		
		scanner.close();
	}
}

package entities;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Counter {
	private Integer numberOne;
	private Integer numberTwo;
	
	public Counter() {
	}

	public Counter(Integer numberOne, Integer numberTwo) {
		super();
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
	}
	
	public List<Integer> count() {
		if(this.getNumberOne() > this.getNumberTwo()) throw new InvalidParameterException("O segundo numero deve ser maior que o primeiro.");
		List<Integer> numbers = new ArrayList<Integer>();
		int numberOfIterations = this.getNumberTwo() - this.getNumberOne() ;	
		for (int i = 1; i <= numberOfIterations; i++) {
			numbers.add(i);
		}
		
		return numbers;
	}

	public Integer getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(Integer numberOne) {
		this.numberOne = numberOne;
	}

	public Integer getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(Integer numberTwo) {
		this.numberTwo = numberTwo;
	}
}

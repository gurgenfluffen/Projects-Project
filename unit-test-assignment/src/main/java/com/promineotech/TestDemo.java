package com.promineotech;

import java.util.Random;

public class TestDemo {
	
	
	
public int addPositive(int a, int b) {
		
		if (a > 0 && b > 0) {
			int result = a + b;
			return result;
		} else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
		
	}

public String inputWord(String word) {
	
	
	
	if (word.contains("ie")) {
		return word;
	
	} else {
		throw new IllegalArgumentException("Your word must contain the letter sequence \"ie\".");
	}
}

public int randomNumberSquared() {
	
	int randomNumber = getRandomInt();
	return randomNumber * randomNumber;
}


int getRandomInt() {
	Random random = new Random();
	return random.nextInt(10) + 1;
}
}

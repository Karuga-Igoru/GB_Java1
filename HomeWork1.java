class HomeWork1 {
	public static void main (String[] args) {
		System.out.println("Homework #1");
		printThreeWords();
		checkSumSign();
		printColor();
		compareNumbers();
	}
	static void printThreeWords() {
		System.out.println();
		System.out.println("Ex #2 'Print three words'");
		System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Apple");
	}
	static void checkSumSign() {
		System.out.println();
		System.out.println("Ex #3 'Sign of sum'");
		int a = 5;
		int b = 3;
		boolean c = a + b >= 0;
		System.out.println("Sum is positive? - "+ c);	
	}
	static void printColor() {
		System.out.println();
		System.out.println("Ex #4 'Color of number'");
		int firstMagicNumber = (int) (Math.random() * 1000);
		int secondMagicNumber = (int) (Math.random() * -1000);
		int value = firstMagicNumber + secondMagicNumber;
		if (value <= 0) {
			System.out.println("Red - " + value);
		} else {
			if (value < 100) {
				System.out.println("Yellow - " + value);
			} else {
				System.out.println("Green - " + value);
			}
		}
	}
	static void compareNumbers() {
		System.out.println();
		System.out.println("Ex #5 'Compairing two numbers'");
		int a = (int) (Math.random() * 10);
		int b = (int) (Math.random() * 10);
		if (a >= b) {
			System.out.println("a >= b");
		} else {
			System.out.println("a < b");
		}
	}
}


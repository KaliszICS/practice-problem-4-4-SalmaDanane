public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean hasCapital(String word) {
			if (word.toLowerCase() == word) { //checking for lowercase
				return false;
			}
        return true;
		}

	public static boolean isPrime(int number) {
		if (number == 1 ) { // isnt a prime
				return false;
			}
		for (int i = 2; i < number; i++) {
			if (number % i == 0){
				return false;
			}
		}
		return true;
	}


}


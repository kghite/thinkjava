class Cond {
	public static void main(String[] args) {
		int x = -2;
		
		if (x > 0) {
			System.out.println("x is positive");
		}
		else if (x == 0) {
			System.out.println("x is zero");
		}
		else {
			System.out.println("x is negative");
		}

		if (x%2 == 0) {
			System.out.println("x is even");
		}
	}
}
class Types {
	public static void main(String[] args) {
		// Type casting
		double pi = 3.14159;
		int x = (int) pi;
		System.out.println("Double value: " + pi);
		System.out.println("Int value: " + x);

		// Rounding in type casting (always rounds down)
		double y = 3.6;
		int z = (int) y;
		System.out.println("Double value: " + y);
		System.out.println("Rounded int value: " + z);

		// Using Math methods
		double root = Math.sqrt(17.0);
		System.out.println(root);
	}
}
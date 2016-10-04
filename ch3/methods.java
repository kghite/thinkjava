class Methods {
	public static void main(String[] args) {
		System.out.println("First line of text");
		newLine();
		System.out.print("Second line of text");
		newLine();
		printTwice("Printing this twice");
	}

	public static void newLine() {
		System.out.println("");
	}

	// NOTE: A parameter is a variable that stores an argument
	public static void printTwice(String s) {
		System.out.println(s);
		System.out.println(s);
	}
}
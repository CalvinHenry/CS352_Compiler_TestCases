// This sample contains a little bit more syntax usage than Factorial
// - List of statements in a block
// - Assignment operations
// - Function calls with multiple arguments
class HanoiDemo {
	public static void main (String [] argv) {
		{
			// Statements
			// `dummy` is a variable.
			// It is not declared but the syntax parser doesn't care about that.
			// In this way the program can survive parsing.
			dummy = new Hanoi().start(8);

			/* The class `Numbers` is in the second sample code
			 * This also poses no syntax errors but is semantically incorrect
			 */
			System.out.println(new Numbers().choose(10, 5));
		}
	}
}

class Hanoi {
	// members go here, but here the list is empty.

	// methods go here
	public int start(int n) {
		// move `n` disks from disk 1 to disk 3, using disk 2
		dummy = this.recursive(n, 1, 2, 3);
		// The methods always return a value.
		// It's important that the return value is assigned to a variable
		// since in the grammar, a single method invocation does not
		// comprise an entire statement - only an expression.
		return 0;
	}
	public int recursive(int n, int start, int middle, int end) {
		if (n <= 1) {
			System.out.println("move 1 from ");
			System.out.println(start);
			System.out.println(" to ");
			System.out.println(end);
			System.out.println("\n");
		} else {
			// move 1 to n-1 from start to middle
			dummy = this.recursive(n-1, start, end, middle);
			// move n from start to end
			System.out.println("move ");
			System.out.println(n);
			System.out.println(" from ");
			System.out.println(start);
			System.out.println(" to ");
			System.out.println(end);
			// move 1 to n-1 from middle to end
			dummy = this.recursive(n-1, middle, start, end);
		}
		return 0;
	}
}



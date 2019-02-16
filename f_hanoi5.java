// This sample contains a number of violations to the syntax set forth
// They are all marked with number
// You are only required to report the first problem that occurs
// So to test all of them, you can comment out the violations and move on to the next.

// 1. This is not a main class since it does not have the main function
//    You should report an error on this following line.
//class Hanoi {}
// After this is done, you can comment out the previous line and move on.

class HanoiDemo {
	public static void main (String [] argv) {

			dummy = new Hanoi().start(8);

			// 2. If there are multiple statements in the main function,
			//    they have to be inside a pair of braces.
			//System.out.println(new Numbers().choose(10, 5));
	}
}

class Hanoi {
	// members go here, but here the list is empty.

	// methods go here
	public int start(int n) {
		// move `n` disks from disk 1 to disk 3, using disk 2
		dummy = this.recursive(n, 1, 2, 3);
		
		// 3. declaring variables after a statement is not allowed.
		//int x;

		// 4. this function does not have a return statement!
		//    uncomment the following line to move on.
		// return 1;
	}

	// 5. the method name is missing here!
	public int recursive (int n, int start, int middle, int end) {
		if (n <= 1) {
			System.out.println("move 1 from ");
			System.out.println(start);
			System.out.println(" to ");
			System.out.println(end);
			System.out.println("\n");
		} else {
			// 6. variable declaration cannot appear in statement list.
			//    They have to be at the beginning of a method.
			int troublemaker;

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


// This file tests for recursive calls with arguments
class p_HanoiDemo {
	public static void main (String [] argv) {
		System.out.println(new Hanoi().start(5));
	}
}

class Hanoi {
	public int start(int n) {
		int x;
		// move `n` disks from disk 1 to disk 3, using disk 2
		x = this.recursive(n, 1, 2, 3);

		return 1;
	}

	public int  recursive  (int n, int start, int middle, int end) {
		int dummy;
		if (n <= 1) {
			System.out.print("move 1 from ");
			System.out.print(start);
			System.out.print(" to ");
			System.out.print(end);
			System.out.print("\n");
		} else {
			// move 1 to n-1 from start to middle
			dummy = this.recursive(n-1, start, end, middle);
			// move n from start to end
			System.out.print("move ");
			System.out.print(n);
			System.out.print(" from ");
			System.out.print(start);
			System.out.print(" to ");
			System.out.println(end);
			// move 1 to n-1 from middle to end
			dummy = this.recursive(n-1, middle, start, end);
		}
		return 0;
	}
}



// This sample contains a number of violations to the syntax set forth
// They are all marked with number
// You are only required to report the first problem that occurs
// So to test all of them, you can comment out the violations and move on to the next.

class NumberDemo {
	public static void main(String [] a) {
        {
			// 1. declaring variables in the main function is not allowed.
			Numbers n;

			n = new Numbers();
			// 2. Simply call a method without assigning to a variable is not allowed.
			n.choose(10, 4);

			System.out.println("10 choose 4 is ");
			System.out.println(new Numbers().choose(10, 4));
			System.out.println("\nGCD of 84, 132 is ");

			// 3. invalid expression inside the argument list
			System.out.println(int);
        }
	}
}

class Numbers {
	public int choose(int n, int k) {
		int res;
        int i;
		if (!(n<k)) {
			// n! / (k! (n-k)!)
			i = 1;
			res = +1; // just to test unary +
			while (i <= k) {
				// 3. Left parentheses is missing,
				//    here v
				res = res * n-k+i) / i;
			}
		}
		// 4. The `else` case is missing!
		/*else {
			res = 0;
		}*/
		return res;
	}

	public int gcd(int a, int b) {
		int tmp;
        int res;
		if (a < b)
			// 5. No braces around a group of statements!
			//    but what's the big deal?
			tmp = a; a = b; b = tmp;
		else {
		}
		if (b == 0)
			res = a;
			// 6. Here's a character not in our alphabet..
		else if (a % b == 0) {
			res = this.gcd(b, a-b*(a/b));
		} else {
			res = b;
		}
		return res;
	}
}

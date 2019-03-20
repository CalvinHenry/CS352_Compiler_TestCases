class p_NumberDemo {
	public static void main(String [] a) {
        {
		System.out.println("10 choose 4 is ");
		//System.out.println(new Numbers().choose(10, 4));
		System.out.println("add 2 numbers ");
		System.out.println(new Numbers().add(84, 132));
        }
	}
}

// The following code contains these legitimage syntax usage:
// - Variable declarations
// - Unary and complicated binary arithmetic operations
// - While loop
class Numbers {
    int sum;
    public int start(){
        sum = 0;
        return 0;
    }
	public int add(int n, int k) {
            int x;
            int y;
            x = 10;
            y = 10;
            System.out.print("N is: ");
            System.out.println(n);
            sum = x + y + sum;
            if(sum < 50){
                System.out.println(sum);
                return this.add(n,k); }
            else if(sum >= 50)
                    return sum;
            else {}
            return sum;

	}

	public int gcd(int a, int b) {
		int tmp;
        int res;
		if (a < b) {
			tmp = a;
			a = b;
			b = tmp;
		} else {
		}
		if (b == 0)
			res = a;
		else if ((a / b) * b != a) {
			res = this.gcd(b, a-b*(a/b));
		} else {
			res = b;
		}
		return res;
	}
}

// This test case requires that you interpret method calls with parameters.
// No instance variable is touched.
class p_number {
    public static void main(String [] a) {
        {
            System.out.println("10 choose 4 is ");
            System.out.println(new Numbers().choose(10, 4));
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
                res = res * (n-k+i) / i;
                i = i + 1;
            }
        } else {
            res = 0;
        }
        return res;
    }

}

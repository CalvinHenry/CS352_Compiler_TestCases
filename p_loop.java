// You are supposed to support method calling for testing this case.
// The minimum required would be calling a method with an empty parameter list and belongs to a class without instance variables.
class p_loop {
    public static void main(String [] args) {
        {
        System.out.print("Factorial of 10 is:");
        System.out.println(new Factorial().compute10());
        }
    }
}

// This test case tests while loop execution.
class Factorial {
    public int compute10() {
        int prod;
        int multiplier;
        multiplier = 1;
        prod = 1;
        while (multiplier <= 10) {
            prod = prod * multiplier;
            multiplier = multiplier + 1;
        }
        return prod;
    }
}

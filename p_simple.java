// This example involves string literal printing, integer printing,
// and if-else branch execution.
// Indicated by the else branch, your interpretation should not print the line in it.
class p_simple {
    public static void main(String [] args) {
        if (true && (2 < 3)) {
            System.out.println("This line should be printed. A bunch of expressions:");
            System.out.println(5);
            System.out.println(3 + 4 + 5 + 35);
            System.out.println(32 - 70 - 2 + 9);
            System.out.println(77 - 6/3);
            System.out.println((5 + 3) * 17);
        } else {
            System.out.println("This line should not be printed");
        }
    }
}
